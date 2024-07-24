package com.example.journalApp.entity;

public class JournalEntry {

    private long id;
    private String title;
    private String content;

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
