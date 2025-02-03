package com.bankrev.util;

import com.bankrev.dto.AccountDto;
import com.bankrev.entities.Account;

public class ConvertUtil {
    public static AccountDto convertToAccountDto(com.bankrev.entities.Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setName(account.getName());
        accountDto.setBalance(account.getBalance());
        return accountDto;
    }
    public static Account convertToAccount(com.bankrev.dto.AccountDto accountDto) {
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setName(accountDto.getName());
        account.setBalance(accountDto.getBalance());
        return account;
    }
}
