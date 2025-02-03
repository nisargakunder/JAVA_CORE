package com.productapp.service;

import com.productapp.repo.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ProductService {


   public Product getById(int id);
   public  List<Product> getListOfAllProducts();


   public List<Product> getListOfAllProductsBasedOnName(String name);

     public List<Product> getListOfAllProductsBasedOnNameV2(@Param("name")  String name);


    public List<Product> getListOfAllProductsBasedOnNameAndPrice(String name, BigDecimal price);

    public List<Product> getListOfAllProductsBasedOnNameOrPrice(String name, BigDecimal price);

    public List<Product> findByName(String name);
    List<Product> findByNameContaining(String name);
     List<Product> findByNameLike(String name);
     List<Product> findByNameStartingWith(String name);
    List<Product> findByNameEndingWith(String name);
   List<Product> findByNameIgnoreCase(String name);


    List<Product> findByMfgDateAfter(LocalDate date);
    List<Product> findByMfgDateBefore(LocalDate date);
    List<Product> findByMfgDateBetween(LocalDate date1, LocalDate date);



}
