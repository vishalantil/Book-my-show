package com.book_my_show.BookmyShow.Exceptions;

public class TheatreNotFoundException extends RuntimeException {
    public TheatreNotFoundException(String message) {
        super(message);
    }
}
