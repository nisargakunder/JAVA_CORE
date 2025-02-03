package com.bankrev.service;

import com.bankrev.dto.AccountDto;
import com.bankrev.dto.DepositDto;
import com.bankrev.dto.TransferDto;
import com.bankrev.dto.WithdrawDto;
import com.bankrev.entities.Account;
import org.aspectj.weaver.tools.Trace;

import java.math.BigDecimal;
import java.util.List;
//we shld never return entites to user so ur returning dto
//dto is used btw service nd ui
public interface AccountService {
public List<AccountDto> getAllAccounts();
public AccountDto getAccountById(int id);
public AccountDto getAccount(int id);
public  String transfer(TransferDto transferDto);
public String withdraw(WithdrawDto withdrawDto);
public String deposit(DepositDto depositDto);

}
