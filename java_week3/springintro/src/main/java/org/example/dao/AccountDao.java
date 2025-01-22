package org.example.dao;

import java.util.List;

public interface AccountDao {
    public List<Account> getAllAccount();

    public Account getByid(int id);
}
