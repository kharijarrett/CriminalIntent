package com.example.kj.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    //Constructor
    public Crime(){
        this(UUID.randomUUID());
    }

    //Other constructor
    public Crime(UUID id) {
        mId = id;
        mDate = new Date();

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public static String formatDate(Date date) {
        return DateFormat.getDateInstance().format(date);
    }

    public static String formatTime(Date date) {return DateFormat.getTimeInstance().format(date);}
}