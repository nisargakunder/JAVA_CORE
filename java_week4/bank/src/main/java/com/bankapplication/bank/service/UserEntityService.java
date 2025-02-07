package com.bankapplication.bank.service;


import com.bankapplication.bank.repo.UserEntity;

public interface UserEntityService {
    public UserEntity findByUsername(String username);
    public void addUserEntity(UserEntity userEntity);
}