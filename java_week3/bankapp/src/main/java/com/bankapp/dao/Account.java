package com.bankapp.dao;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
   @NotEmpty(message = "{account.name.absent}")
    private String name;
   @NotNull(message = "{account.balance.absent}")
   @Range(min = 100,max=10000000, message = "{account.balance.invalid}")
    private double balance;

    public Account( double balance, String name) {

        this.balance = balance;
        this.name = name;
    }
}
