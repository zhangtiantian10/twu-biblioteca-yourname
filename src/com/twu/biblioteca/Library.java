package com.twu.biblioteca;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printBooks() {
        String printTitle = "";
        for (Book book : books) {
            printTitle = book.getTitle();
        }

        System.out.println(printTitle);
    }
}
