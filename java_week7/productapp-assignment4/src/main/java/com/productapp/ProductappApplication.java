package com.productapp;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;
import java.util.List;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String name, Integer qty, String vendor, Double cost

		//insert();
		Product products =productRepo.getProdcutByIds("67b37780df25b12c68419b84").orElseThrow(()->new RuntimeException("Product not found"));
		System.out.println(products);
		System.out.println("************************");
		List<Product> products2 = productRepo.getProductsByQtyLessThan(50);
		products2.forEach(System.out::println);
		System.out.println("************************");
		List<Product> products3=productRepo.getProductdByPagesGreaterThanEqual(50);
		products3.forEach(System.out::println);
		System.out.println("************************");
		List<Product> products4=productRepo.getProductsByQty(50);
		products4.forEach(System.out::println);
		System.out.println("************************");
		List<Product> products5=productRepo.getProductsByVendor("AB electronic");
		products5.forEach(System.out::println);
		System.out.println("************************");

	}


	private void insert() {
		productRepo.save(new Product("dell laptop", 30, "AB electronic", 5000000.0));
		productRepo.save(new Product("mouse", 300, "MA electronic", 500.0));
		productRepo.save(new Product("Keyboard", 20, "ZA electronic", 600.0));
		System.out.println("------------------------");
	}
}
