package com.productapp;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class Productapp01Application implements CommandLineRunner {
	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//
//		productRepo.save(new Product("Laptop", new BigDecimal(10000), LocalDate.now()));
//		productRepo.save(new Product("Mobile", new BigDecimal(5000), LocalDate.now()));
//		productRepo.save(new Product("Tablet", new BigDecimal(3000), LocalDate.now()));
//		}
	}
}
