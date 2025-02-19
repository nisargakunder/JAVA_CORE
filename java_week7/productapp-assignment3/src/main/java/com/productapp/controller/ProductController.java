package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody  Product product) {
        return ResponseEntity.status(201).body(productService.save(product));
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getById(@PathVariable  String id) {
        return ResponseEntity.ok(productService.getById(id));
    }
    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable String id) {
        productService.delete(id);
    }
    @PutMapping("/products/update/{id}")
    public ResponseEntity<Product> update(@PathVariable String id, @RequestBody Product product) {
        return ResponseEntity.ok(productService.update(id, product));
    }


}
