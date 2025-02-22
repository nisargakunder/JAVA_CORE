package com.bookapp.service;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;
import com.bookapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        User user1 = userRepo.save(user);
        return user1;
    }

    @Override
    public User getUserById(String id) {
        User user = userRepo.findById(id).orElseThrow(()->new RuntimeException("User not found with id " + id));
        return user;
    }

    @Override
    public void deleteUser(String id) {
        userRepo.deleteById(id);

    }

    @Override
    public User updateUser(User user, String id) {
        User user1 = userRepo.findById(id).orElseThrow(()->new RuntimeException("User not found with id " + id));
        user.setUserName(user1.getUserName());
        user.setEmail(user1.getEmail());
        User user2 = userRepo.save(user);
        return user2;
    }

    @Override
    public List<JournalEntry> getJournalEntries(String id) {
        User user = userRepo.findById(id).orElseThrow(()->new RuntimeException("User not found with id " + id));
        return user.getJournalEntries();
    }
}
