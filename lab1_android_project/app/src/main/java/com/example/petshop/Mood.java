package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    Date moodDate;

    public Mood () {
        this.moodDate = new Date();
    }

    public Mood (Date date) {
        this.moodDate = date;
    }

    public Date getDate() {
        return moodDate;
    }

    public void setDate(Date date) {
        this.moodDate = date;
    }

    public abstract String describeMood();
}
