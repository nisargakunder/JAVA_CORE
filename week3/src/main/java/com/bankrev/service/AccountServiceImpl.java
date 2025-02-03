package com.bankrev.service;

import com.bankrev.Aspect.Loggable;
import com.bankrev.dto.AccountDto;
import java.lang.String;
import com.bankrev.dto.DepositDto;
import com.bankrev.dto.TransferDto;
import com.bankrev.dto.WithdrawDto;
import com.bankrev.entities.Account;
import com.bankrev.exceptions.AccountNotFound;
import com.bankrev.exceptions.NotEnoughFundsException;
import com.bankrev.repo.AccountRepo;
import com.bankrev.util.ConvertUtil;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
@Transactional

public class AccountServiceImpl implements AccountService {
   private  AccountRepo accountRepo;
   private  Environment environment;
   @Autowired
    public AccountServiceImpl(AccountRepo accountRepo, Environment environment) {
        this.accountRepo = accountRepo;
        this.environment = environment;
    }

    @Override
    @Loggable
    public List<AccountDto> getAllAccounts() {
        return accountRepo.findAll().stream().map(ConvertUtil::convertToAccountDto).toList();
    }

    @Override
    @Loggable
    public AccountDto getAccountById(int id) {
        return accountRepo.findById(id).map(ConvertUtil::convertToAccountDto).orElseThrow(()->new AccountNotFound(environment.getProperty("account.notfound")));
   }

    @Override
    @Loggable
    public String transfer(TransferDto transferDto) {

        Account sender = ConvertUtil.convertToAccount(getAccount(transferDto.getFromId()));
        Account receiver = ConvertUtil.convertToAccount(getAccount(transferDto.getToId()));

        if (sender.getBalance().compareTo(transferDto.getAmount()) < 0 )
        {
            throw new NotEnoughFundsException(environment.getProperty("transfer.error"));
        }
        sender.setBalance(sender.getBalance().subtract(transferDto.getAmount()));
        receiver.setBalance(receiver.getBalance().add(transferDto.getAmount()));
        accountRepo.save(sender);
        accountRepo.save(receiver);

        return environment.getProperty("transfer.success");

    }

    public AccountDto getAccount(int fromId) {
        return accountRepo.findById(fromId).map(ConvertUtil::convertToAccountDto).orElseThrow(()->new AccountNotFound("Account not found"));
    }

    @Override
    @Loggable
    public String withdraw(WithdrawDto withdrawDto) {
       Account account = accountRepo.findById(withdrawDto.getId()).orElseThrow(()->new AccountNotFound("Account not found"));
        account.setBalance(account.getBalance().subtract(withdrawDto.getAmount()));
        accountRepo.save(account);
        return environment.getProperty("withdraw.success");
    }

    @Override
    @Loggable
    public String deposit(DepositDto depositDto) {
        Account account = accountRepo.findById(depositDto.getId()).orElseThrow(()->new AccountNotFound("Account not found"));
        account.setBalance(account.getBalance().add(depositDto.getAmount()));
        accountRepo.save(account);
        return environment.getProperty("deposit.success");
    }


}
