package com.example.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.journalApp.entity.JournalEntry;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
 
}
