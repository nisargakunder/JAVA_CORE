package com.bankrev.controller;

import com.bankrev.dto.AccountDto;
import com.bankrev.dto.TransferDto;
import com.bankrev.dto.WithdrawDto;
import com.bankrev.dto.DepositDto;
import com.bankrev.service.AccountService;
import jakarta.persistence.GeneratedValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    private AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;

    }
    @GetMapping("/accounts")
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        return ResponseEntity.ok().body(accountService.getAllAccounts());
    }//return ResponseEntity.ok(accountService.getAllAccounts());}
    @GetMapping("/accounts/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable int id){
        return ResponseEntity.ok().body(accountService.getAccountById(id));
    }

}
