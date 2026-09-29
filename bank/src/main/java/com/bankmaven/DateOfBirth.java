package com.bankmaven;


public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }    

    public String forTest() {
        return "testing";
    }

}