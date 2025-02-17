package com.mongoex;

import com.mongoex.entities.Book;
import com.mongoex.exceptions.BookNotFoundException;
import com.mongoex.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootApplication
public class MongoApplication  implements CommandLineRunner {
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {

		SpringApplication.run(MongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book=bookRepo.getBookByTdQuery("67b2cb4dd0cefe570d0b28ef");
		System.out.println(book);
		List<Book> getAll = bookRepo.getbyPagesless(300);
		getAll.forEach(System.out::println);
//		List<Book> getAll = bookRepo.findAll();
//		getAll.forEach(System.out::println);
//		//getbyid
//		Book book = bookRepo.findById("67b2cb4dd0cefe570d0b28ef").orElseThrow(()->new BookNotFoundException("book not found"));
//		System.out.println(book);
//		//update Byid
//		Book book1 = bookRepo.findById("67b2cb4dd0cefe570d0b28ef").orElseThrow(()->new BookNotFoundException("book not found"));
//		book1.setCost(1000.0);
//		bookRepo.save(book1);

		//update by name
//			bookRepo.save(new Book("Java", 100, "Author 1", 1000.0));
//			bookRepo.save(new Book("algebra", 300, "gunika", 900.0));
//			bookRepo.save(new Book("adv maths", 300, "ektga", 500.0));
//			bookRepo.save(new Book("spring boot", 300, "raj", 700.0));
//			bookRepo.save(new Book("python adv", 200, "raj", 600.0));
//		}

		}
	}

