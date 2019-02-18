package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaAppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private BibliotecaApp bibliotecaApp;
    private Library library;
    private String title;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        bibliotecaApp = new BibliotecaApp();
        library = mock(Library.class);
        title = "Book";
    }

    @Test
    public void welcomeTest() {
        bibliotecaApp.welcomeCustomer();

        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n", outContent.toString());
    }

    @Test
    public void checkoutBookIsSuccessful() {
        when(library.checkoutBook(title)).thenReturn(true);

        bibliotecaApp.checkoutBook(title, library);

        assertEquals("Thank you! Enjoy the book\n", outContent.toString());
    }

    @Test
    public void checkoutBookIsError() {
        when(library.checkoutBook(title)).thenReturn(false);

        bibliotecaApp.checkoutBook(title, library);

        assertEquals("Sorry, that book is not available\n", outContent.toString());
    }

    @Test
    public void returnBookIsSuccess() {
        when(library.returnBook(title)).thenReturn(true);

        bibliotecaApp.returnBook(title, library);

        assertEquals("Thank you for returning the book.\n", outContent.toString());
    }

    @Test
    public void returnBookIsError() {
        when(library.returnBook(title)).thenReturn(false);

        bibliotecaApp.returnBook(title, library);

        assertEquals("That is not valid book to return.\n", outContent.toString());
    }
}
