package com.book_my_show.BookmyShow.Exceptions;

public class SeatsNotAvailableException extends RuntimeException {
    public SeatsNotAvailableException(String message) {
        super(message);
    }
}
