package com.bankrev.controller;

import com.bankrev.dto.AccountDto;
import com.bankrev.dto.DepositDto;
import com.bankrev.dto.TransferDto;
import com.bankrev.dto.WithdrawDto;
import com.bankrev.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class AccountTransferController {
    private AccountService accountService;

    public AccountTransferController(AccountService accountService) {
        this.accountService = accountService;

    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestBody @Valid TransferDto transferDto){
        return ResponseEntity.ok().body(accountService.transfer(transferDto));
    }
    @PostMapping("/withdraw")
    public ResponseEntity<String> withdraw(@RequestBody @Valid WithdrawDto withdrawDto){
        return ResponseEntity.ok().body(accountService.withdraw(withdrawDto));
    }
    @PostMapping("/deposit")
    public ResponseEntity<String> deposit(@RequestBody DepositDto depositDto){
        return ResponseEntity.ok().body(accountService.deposit(depositDto));
    }
}
