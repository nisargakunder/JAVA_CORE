package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountBean;
import com.bankapp.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.exceptions.AccountNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo accountRepo;
    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public String transfer(AccountBean accountBean) throws AccountNotFoundException {

        int from = accountBean.getFrom();
        int to = accountBean.getTo();
        double amount = accountBean.getAmount();
        Account source= accountRepo.findById(from).orElseThrow(() -> new AccountNotFoundException("Account not found"));
        Account target = accountRepo.findById(to).orElseThrow(() -> new AccountNotFoundException("Account not found"));
        if (source.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        source.setBalance(source.getBalance() - amount);
        target.setBalance(target.getBalance() + amount);
        accountRepo.save(source);
        accountRepo.save(target);
        return "Transfer successful";
    }

    @Override
    public String deposit(AccountBean accountBean) throws AccountNotFoundException {
        int id = accountBean.getFrom();
        double amount = accountBean.getAmount();
        Account account = accountRepo.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found"));
        account.setBalance(account.getBalance() + amount);
        accountRepo.save(account);
        return "Deposit successful";

    }
    @Override
    public Account getAccount(int id) {
        return accountRepo.findById(id).orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

}
