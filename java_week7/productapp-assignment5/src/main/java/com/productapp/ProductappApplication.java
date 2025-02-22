package com.productapp;

import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.awt.print.Book;
import java.util.List;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		//insert();
		//insertall();
		Query query= new Query();
		query.addCriteria(Criteria.where("id").is("67b9e1031c581d4af651c9d3"));

		Update update = new Update();
		update.set("cost", 1065.25);
		update.set("name", "Drawing set");
		mongoTemplate.findAndModify(query, update, Product.class);

		System.out.println("Data Modified");


		Query query2= new Query();
		query.addCriteria(Criteria.where("qty").lte(180));
		Update update2 = new Update();
		update.set("cost", 999.0);
		mongoTemplate.updateMulti(query, update, Product.class);

		Query query3= new Query();
		query.addCriteria(Criteria.where("cost").gte(1000.0));
		mongoTemplate.findAllAndRemove(query, Product.class);
		Query query4= new Query();
		query.addCriteria(Criteria.where("id").is(510));
		Update update4 = new Update();
		update.set("cost", 1065.25);
		update.set("name", "Core Java");
		mongoTemplate.upsert(query, update, Product.class);

        System.out.println(findProductsByQtysGreaterThan(5));
		System.out.println(findProductsByVendor("MK"));




	}
	private List<Product> findProductsByVendor(String vendor) {
		Query query = new Query(Criteria.where("vendor").is(vendor));
		return mongoTemplate.find(query, Product.class);
	}

	public List<Product> findProductsByQtysGreaterThan(int qty) {

		Query query = new Query(Criteria.where("qty").gt(qty));
		return mongoTemplate.find(query, Product.class);
	}

    private void insertall(){
		List<Product> products= List.of(
				new Product("macbook", 10, "apple", 5000000.0),
			new Product("umbrella", 200, "MK", 250.0),
				new Product("shoes",23,"sks",766.0));
		mongoTemplate.insertAll(products);
		mongoTemplate.insert(products,"mycollection");

	}

	private void insert() {
		productRepo.save(new Product("dell laptop", 30, "AB electronic", 5000000.0));
		productRepo.save(new Product("mouse", 300, "MA electronic", 500.0));
		productRepo.save(new Product("Keyboard", 20, "ZA electronic", 600.0));
		System.out.println("------------------------");
	}
}
