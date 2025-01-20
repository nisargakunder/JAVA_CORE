package org.example;

import org.example.Service.BookService;
import org.example.Service.BookServiceImpl;
import org.example.dto.Book;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BookService bookService = new BookServiceImpl();
        System.out.println("Add Book Record");
        Book book=new Book(1,"isbn1","As You Like It",1000,"William Shakespeare");
        bookService.addBook(book);
        Book book1=new Book(2,"isbn2","Patriot",278,"Nathaniel Hawthorne");
        bookService.addBook(book1);
        Book book2=new Book(3,"isbn3","The Old Man and the Sea",100,"Ernest Hemingway");
        bookService.addBook(book2);



        List<Book> books=bookService.getAllBooks();


        System.out.println("Fetch All Book Records");

        books.forEach(System.out::println);
        System.out.println("Delete The Record");
        bookService.deleteBook(2);
        System.out.println("Update Book Record");
        book=new Book(3,"isbn3","Two Horses And Two Goat",1358,"R.K NARAYAN");
        bookService.updateBook(3,book);
        }
    }

