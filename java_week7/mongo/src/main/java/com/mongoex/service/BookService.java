package com.mongoex.service;

import com.mongoex.entities.Book;

import java.util.List;

public interface BookService {
    public Book addBook(Book book);
    public List<Book> getAllBooks();
    public Book getBookById(String id);
    public Book updateBook(Book book);
    public void deleteBook(String id);


}
