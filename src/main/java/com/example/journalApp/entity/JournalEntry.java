package com.example.journalApp.entity;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journal_entries")
public class JournalEntry {
    @Id
    private String id;
    private String title;
    private String content;
    private Date date;


    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public Date getDate(){
        return date;    
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
