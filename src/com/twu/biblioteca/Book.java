package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String year;
    private boolean isCheckOut = false;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
        this.author = "";
        this.year = "";
    }

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title, String author, String year, boolean isCheckOut) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isCheckOut = isCheckOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }
}
