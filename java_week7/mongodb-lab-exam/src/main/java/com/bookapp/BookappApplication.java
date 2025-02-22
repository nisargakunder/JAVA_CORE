package com.bookapp;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;
import com.bookapp.exceptions.ResourceNotFoundException;
import com.bookapp.repo.JournalEntryRepo;
import com.bookapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private JournalEntryRepo journalEntryRepo;
	@Override
	public void run(String... args) throws Exception {

		JournalEntry journal1 = new JournalEntry("first day","great start", LocalDateTime.now());
		JournalEntry journal2 = journalEntryRepo.save(new JournalEntry("new job","new beginning", LocalDateTime.now()));
		JournalEntry journal3 = journalEntryRepo.save(new JournalEntry("fresh mornings","great day great start", LocalDateTime.now()));
		journalEntryRepo.save(journal1);

		User user1=new User("nisarga","nissy@123");
		user1.getJournalEntries().add(journal1);
		userRepo.save(user1);
		User user2=new User("neha","neha@123");
		user2.getJournalEntries().add(journal2);
		user2.getJournalEntries().add(journal3);
		userRepo.save(user2);

	}

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

}
