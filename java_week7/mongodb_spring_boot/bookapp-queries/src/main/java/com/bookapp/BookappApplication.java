package com.bookapp;

import com.bookapp.entities.Book;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private BookRepo bookRepo;
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		//getting book by id
		//bookRepo.deleteAll();
		//insertAllRecords();
		Query query=new Query();
		query.addCriteria(Criteria.where("name").is("all is well"));
		Update update=new Update();
		update.set("author","nisarga");
		update.set("cost",500.0);
		mongoTemplate.upsert(query,update,Book.class);

	}

	private void insertAllRecords() {
		bookRepo.save(new Book("core java", 270, "raj", 300.0));
		bookRepo.save(new Book("spring boot", 770, "raj", 550.0));
		bookRepo.save(new Book("algebra", 200, "gunika", 900.0));
		bookRepo.save(new Book("adv maths", 170, "ekta", 500.0));
		bookRepo.save(new Book("spring boot", 300, "raj", 700.0));
		bookRepo.save(new Book("python adv", 220, "keshav", 600.0));
	}
}
