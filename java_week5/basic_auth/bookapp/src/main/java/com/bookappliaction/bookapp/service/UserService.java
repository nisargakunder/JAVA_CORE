package com.bookappliaction.bookapp.service;

import com.bookappliaction.bookapp.repo.UserEntity;

public interface UserService {
    public UserEntity findByUsername(String username);
    public void addUserEntity(UserEntity userEntity);

}