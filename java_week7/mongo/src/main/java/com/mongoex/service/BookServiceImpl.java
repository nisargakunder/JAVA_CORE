package com.mongoex.service;

import com.mongoex.entities.Book;
import com.mongoex.exceptions.BookNotFoundException;
import com.mongoex.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;
    @Override
    public Book addBook(Book book) {
       return bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();


    }

    @Override
    public Book getBookById(String id) {
        return bookRepo.findById(id).orElseThrow(()->new BookNotFoundException("book not found"));
    }

    @Override
    public Book updateBook(Book book) {
        Book book1=bookRepo.findById(book.getId()).orElseThrow(()->new BookNotFoundException("book not found"));
        book1.setCost(book1.getCost()+1000);
        return bookRepo.save(book1);
    }

    @Override
    public void deleteBook(String id) {
        bookRepo.deleteById(id);

    }
}
