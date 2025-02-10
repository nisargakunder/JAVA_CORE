package com.bookappliaction.bookapp.config;

import com.bookappliaction.bookapp.repo.UserEntity;
import com.bookappliaction.bookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity=userService.findByUsername(username);
        if(userEntity==null)
            throw new UsernameNotFoundException("Username/password is invalid");
        //now problem: userEntity--->UserDetails(which spring sec understand)
        return new SecUser(userEntity);
    }
}