package com.bookapp.controller;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;
import com.bookapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.status(201).body(userService.saveUser(user));
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable String id){
        return ResponseEntity.ok(userService.updateUser(user,id));
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
    @GetMapping("/user/journalEntries/{id}")
    public ResponseEntity<List<JournalEntry>> getJournalEntries(@PathVariable String id){
        return ResponseEntity.ok(userService.getJournalEntries(id));
    }

}
