package com.productapp.repo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    @NotEmpty(message = "name must not be empty")
    private String name;
    @NotNull(message = "price shld not be null")
    @Range(min=10,max=1000000,message="out of limits")
    private BigDecimal price;

}
