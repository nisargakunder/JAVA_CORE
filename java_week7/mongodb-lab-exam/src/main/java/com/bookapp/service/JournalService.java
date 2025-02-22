package com.bookapp.service;

import com.bookapp.entities.JournalEntry;

public interface JournalService {
    public JournalEntry saveJournalEntry(JournalEntry journalEntry);
    public JournalEntry updateJournalEntry(JournalEntry journalEntry, String id);
    public JournalEntry getJournalEntryById(String id);
    public void deleteJournalEntry(String id);

}
