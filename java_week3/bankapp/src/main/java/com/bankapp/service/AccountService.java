package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountBean;

import javax.security.auth.login.AccountNotFoundException;

public interface AccountService {
    public String transfer(AccountBean accountBean) throws AccountNotFoundException;
   public String deposit(AccountBean accountBean);
    public Account getAccount(int id);
}