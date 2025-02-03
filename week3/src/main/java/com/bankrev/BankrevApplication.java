package com.bankrev;

import com.bankrev.entities.Account;
import com.bankrev.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;

@SpringBootApplication
public class BankrevApplication implements
		CommandLineRunner {
	@Autowired
	private AccountRepo accountRepo;

	public static void main(String[] args) {
		SpringApplication.run(BankrevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account(new BigDecimal(1000),"nissy"));
		accountRepo.save(new Account(new BigDecimal(1000),"neha"));
	}
}
