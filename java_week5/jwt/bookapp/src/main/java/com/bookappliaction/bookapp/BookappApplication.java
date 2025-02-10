package com.bookappliaction.bookapp;

import com.bookappliaction.bookapp.repo.Book;
import com.bookappliaction.bookapp.repo.BookRepo;
import com.bookappliaction.bookapp.repo.UserEntity;
import com.bookappliaction.bookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.addUserEntity(new UserEntity("preeti",
//				passwordEncoder.encode("preeti123"), List.of("Student")));
//
//		userService.addUserEntity(new UserEntity("ria",passwordEncoder.encode("ria123"),
//				List.of("Teacher")));
//
//		userService.addUserEntity(new UserEntity("Vikky",passwordEncoder.encode("vik123"),
//				List.of("Teacher","Student")));
	}
	}

