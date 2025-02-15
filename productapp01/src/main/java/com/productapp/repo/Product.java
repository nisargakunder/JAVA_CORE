package com.productapp.repo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "name must not be empty")
    private String name;
    @NotNull(message = "price shld not be null")
    private LocalDate mfgDate;
    @Range(min=10,max=1000000,message="out of limits")
    private BigDecimal price;

    public Product(String name, BigDecimal price, LocalDate mfgDate) {
        this.name = name;
        this.price = price;
        this.mfgDate = mfgDate;
    }


}
