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
        System.out.println("Title Author Public-Year");
        if (books.size() == 0)
            System.out.println("");
        else
            for (Book book : books) {
                if (!book.isCheckOut())
                    System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getYear());
            }
    }

    public boolean checkoutBook(String title) {
        boolean flag = false;
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isCheckOut()) {
                book.setCheckOut(true);
                flag = true;
                break;
            }
        }

        return flag;
    }

    public boolean returnBook(String title) {
        boolean flag = false;
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isCheckOut()) {
                book.setCheckOut(false);
                flag = true;
                break;
            }
        }

        return flag;
    }
}
