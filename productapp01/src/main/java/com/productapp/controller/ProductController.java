package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")  //this is applicable to all urls here
public class ProductController {
    private ProductService productService;

    @Autowired   // u have one constructor inside a class and have to do injection thn autowired is optional
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {

        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());



    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {

        return ResponseEntity.status(HttpStatus.OK).body(productService.getProductById(id));
    }
    //how to return appropriate status code
    //data+ status code both it wraps into ResponseEntity
  @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody @Valid Product product) {

        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
    }
    @PutMapping("/products/{id}")
    public ResponseEntity <Product>updateProduct(@PathVariable int id,@RequestBody @Valid Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id,product)) ;
    }
    @DeleteMapping("/products/{id}")
    public ResponseEntity<Product> removeProduct(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


//exception handling is a cross cutting concern so we have to use aop
}
