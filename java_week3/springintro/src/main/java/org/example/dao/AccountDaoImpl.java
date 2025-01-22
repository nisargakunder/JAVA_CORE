package org.example.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AccountDaoImpl implements AccountDao {
    private Map<Integer, Account> account;
    private int counter;

    public AccountDaoImpl() {
        counter = 0;
        account = new HashMap<>();
        account.put(++counter, new Account(counter, "A", 1000));
        account.put(++counter, new Account(counter, "B", 2000));
    }

    @Override
    public List<Account> getAllAccount() {
        return new LinkedList<>(account.values());
    }


    @Override
    public Account getByid(int id) {
        return account.get(id);
    }
}