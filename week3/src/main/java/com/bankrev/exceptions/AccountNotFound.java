package com.bankrev.exceptions;

public class AccountNotFound extends RuntimeException {

    public AccountNotFound(String message) {
        super(message);
    }
}
