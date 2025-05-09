package com.bookappliaction.bookapp;

import com.bookappliaction.bookapp.repo.Book;
import com.bookappliaction.bookapp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//			bookRepo
//					.save(new Book("Nisarga", BigDecimal.valueOf(1000),"advjava", 2000));
//		bookRepo
//				.save(new Book("Neha", BigDecimal.valueOf(3660),"AI java", 2021));
//	}
	}
}
