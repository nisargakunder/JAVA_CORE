package com.bankapplication.bank.service;

import com.bankapplication.bank.configureation.SecUser;
import com.bankapplication.bank.repo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetailService implements UserDetailsService {

    @Autowired
    private UserEntityService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity=userService.findByUsername(username);
        if(userEntity==null)
            throw new UsernameNotFoundException("Username/password is invalid");
        //now problem: userEntity--->UserDetails(which spring sec understand)
        //so ur converting it to SecUser
        return new SecUser(userEntity);
    }

}