package com.example.list;

import java.util.Date;

public class Announcement {
private String title;
private String description;
private String firstdate;
private String seconddate;
    private int id;

public Announcement(String title, String description, String firstdate, String seconddate,int id){ this.title = title;
    this.description = description;
    this.firstdate = firstdate;
    this.seconddate = seconddate;
    this.id=id;
}

    public Announcement(String title, String description, String firstdate,String seconddate) {
        this.title = title;
        this.description = description;
        this.firstdate = firstdate;
        this.seconddate = seconddate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstdate() {
        return firstdate;
    }

    public void setFirstdate(String firstdate) {
        this.firstdate = firstdate;
    }

    public String getSeconddate () {
        return seconddate;
    }

    public void setSecondDate(String secondDate) {
        this.seconddate = secondDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
