package org.example.Service;

import org.example.Exceptions.BookNotFoundException;
import org.example.Exceptions.DaoException;
import org.example.Repository.BookRepo;
import org.example.Repository.BookRepoImpl;
import org.example.dto.Book;

import java.util.List;

public class BookServiceImpl implements BookService{
  private BookRepo bookRepo=new BookRepoImpl();

    @Override
    public void addBook(Book book) {
        bookRepo.addBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books=bookRepo.getAllBooks();
        return books;
    }

    @Override
    public void deleteBook(int id) {
        bookRepo.deleteBook(id);

    }

    @Override
    public Book getBookById(int id)  {
        Book b=bookRepo.getBookById(id);
        if (b==null){
            throw new BookNotFoundException("Book not found");
        }
        else {
            return b;
        }
    }

    @Override
    public void updateBook(int id, Book book) {
        bookRepo.updateBook(id,book);

    }
}
