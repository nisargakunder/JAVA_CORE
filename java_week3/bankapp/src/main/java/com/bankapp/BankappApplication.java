package com.bankapp;

//import com.bankapp.config.AccConfig;
import com.bankapp.dao.Account;
import com.bankapp.repo.AccountRepo;
import com.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner {

	@Autowired
	public AccountRepo accountRepo;

	public BankappApplication(AccountRepo accountRepo) {

		this.accountRepo = accountRepo;
	}

	public static void main(String[] args) {

		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//
//			accountRepo.save(new Account(1000, "Nisarga"));
//			accountRepo.save(new Account(2000, "Niriksha"));
//	}
	}
}
