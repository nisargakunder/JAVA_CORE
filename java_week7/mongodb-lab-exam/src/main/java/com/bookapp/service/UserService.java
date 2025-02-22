package com.bookapp.service;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public User getUserById(String id);
    public void deleteUser(String id);
    public User updateUser(User user, String id);
    public List<JournalEntry> getJournalEntries(String id);

}
