package com.bookapp.controller;

import com.bookapp.entities.JournalEntry;
import com.bookapp.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JournalController {
    @Autowired
    private JournalService journalService;
    @GetMapping("/journal/{id}")
    public ResponseEntity<JournalEntry> getJournalEntries(@PathVariable String id){
        return ResponseEntity.ok(journalService.getJournalEntryById(id));
    }
    @PostMapping("/journal")
    public ResponseEntity<JournalEntry> saveJournalEntry(@RequestBody JournalEntry journalEntry){

        return ResponseEntity.status(201).body(journalService.saveJournalEntry(journalEntry));

    }
    @PostMapping("/journal/{id}")
    public ResponseEntity<JournalEntry> updateJournalEntry(@RequestBody JournalEntry journalEntry,@PathVariable String id){
        return ResponseEntity.ok(journalService.updateJournalEntry(journalEntry,id));
    }
    @DeleteMapping("/journal/{id}")
    public void deleteJournalEntry(@PathVariable String id){
        journalService.deleteJournalEntry(id);
    }

}
