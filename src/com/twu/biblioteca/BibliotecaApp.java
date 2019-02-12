package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {
    private static Library library = new Library();

    public static void main(String[] args) {
        welcomeCustomer();
        List<Book> books = new ArrayList<Book>();
        library.setBooks(books);
        library.printBooks();
    }

    public static void welcomeCustomer() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
