package com.bankapp.controller;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountBean;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("accounts/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccount(id));
    }
    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@ RequestBody AccountBean accountBean) throws AccountNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.transfer(accountBean));
    }

    @PostMapping("/deposit/{id}/{amount}")
    public ResponseEntity<String> deposit(@RequestBody AccountBean accountBean) {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.deposit(accountBean));
    }


}
