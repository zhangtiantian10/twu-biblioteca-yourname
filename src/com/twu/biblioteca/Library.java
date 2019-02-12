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
        if (books.size() == 0)
            System.out.println("");
        else
            for (Book book : books) {
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear());
            }
    }
}
