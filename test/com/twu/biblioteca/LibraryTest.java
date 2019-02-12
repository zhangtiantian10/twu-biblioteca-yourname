package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private List<Book> books;
    private Library library;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        books = new ArrayList<Book>();
        library = new Library(books);

    }

    @Test
    public void printOneBookTitle() {
        books.add(new Book("Book Title"));

        library.printBooks();

        assertEquals("Book Title\n", outContent.toString());
    }

    @Test
    public void printTwoBooksTitle() {
        books.add(new Book("One"));
        books.add(new Book("Two"));

        library.printBooks();

        assertEquals("One\nTwo\n", outContent.toString());
    }

    @Test
    public void printNothingWhenNotBook() {
        library.printBooks();

        assertEquals("\n", outContent.toString());
    }
}
