package com.bankrev.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@Table
public class AccountDto {

    public AccountDto( String name, BigDecimal balance) {

        this.name = name;
        this.balance = balance;
    }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @NotEmpty(message = "{name.absent}")
        private String name;
        @NotNull(message = "{balance.absent}")
        @Range(min = 0,max=1000000,message = "{amount.invalid}")
        private BigDecimal balance;

    }


