package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    @Autowired   // u have one constructor inside a class and have to do injection thn autowired is optional
    public ProductController(ProductService productService) {

        this.productService = productService;
    }


        @GetMapping("/test")
        public String test() {
            return "Hello, Spring Boot!";
        }
    @GetMapping("/name/{name}")
    public List<Product> getProductsByName(@PathVariable String name) {
        return productService.getListOfAllProductsBasedOnName(name);
    }


    @GetMapping("/nameV2/{name}")
    public List<Product> getProductsByNameV2(@PathVariable String name) {
        return productService.getListOfAllProductsBasedOnNameV2(name);
    }

   @GetMapping("products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getById(id);
    }
    @GetMapping("/name-price")
    public List<Product> getProductsByNameAndPrice(@RequestParam String name, @RequestParam BigDecimal price) {
        return productService.getListOfAllProductsBasedOnNameAndPrice(name, price);
    }


    @GetMapping("/name-or-price")
    public List<Product> getProductsByNameOrPrice(@RequestParam String name, @RequestParam BigDecimal price) {
        return productService.getListOfAllProductsBasedOnNameOrPrice(name, price);
    }


    @GetMapping("/findByName/{name}")
    public List<Product> findProductsByName(@PathVariable String name) {
        return productService.findByName(name);
    }


    @GetMapping("/findByNameContaining/{name}")
    public List<Product> findProductsByNameContaining(@PathVariable String name) {
        return productService.findByNameContaining(name);
    }


    @GetMapping("/findByNameLike/{name}")
    public List<Product> findProductsByNameLike(@PathVariable String name) {
        return productService.findByNameLike(name);
    }


    @GetMapping("/findByNameStartingWith/{name}")
    public List<Product> findProductsByNameStartingWith(@PathVariable String name) {
        return productService.findByNameStartingWith(name);
    }


    @GetMapping("/findByNameEndingWith/{name}")
    public List<Product> findProductsByNameEndingWith(@PathVariable String name) {
        return productService.findByNameEndingWith(name);
    }


    @GetMapping("/findByNameIgnoreCase/{name}")
    public List<Product> findProductsByNameIgnoreCase(@PathVariable String name) {
        return productService.findByNameIgnoreCase(name);
    }


    @GetMapping("/findByMfgDateAfter")
    public List<Product> findProductsByMfgDateAfter(@RequestParam String date) {
        return productService.findByMfgDateAfter(LocalDate.parse(date));
    }


    @GetMapping("/findByMfgDateBefore")
    public List<Product> findProductsByMfgDateBefore(@RequestParam String date) {
        return productService.findByMfgDateBefore(LocalDate.parse(date));
    }

    @GetMapping("/findByMfgDateBetween")
    public List<Product> findProductsByMfgDateBetween(@RequestParam String date1, @RequestParam String date2) {
        return productService.findByMfgDateBetween(LocalDate.parse(date1), LocalDate.parse(date2));
    }

    @GetMapping(path = "productsorted")
    public List<Product> getAllProductSorted(@RequestParam(name="field")  String field) {
        return productService.getAllProductSorted(field);
    }

    //productpage?offset=4&pageSize=20
    @GetMapping(path = "productpage")
    public Page<Product> getAllProductPage(@RequestParam(name="offset") int offset,@RequestParam(name="pageSize") int pageSize) {
        return productService.getAllProductPage(offset, pageSize);
    }

    //productpagesorted?offset=4&pageSize=20&field=id
    @GetMapping(path = "productpagesorted")
    public Page<Product> getAllProductPageSorted(int offset, int pageSize, String field) {
        return productService.getAllProductPageSorted(field, offset, pageSize);
    }

}

//exception handling is a cross cutting concern so we have to use aop
