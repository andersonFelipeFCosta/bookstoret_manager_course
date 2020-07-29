package br.com.affc.bookstoremanager.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BookNotFoundException extends Exception {
    public BookNotFoundException(Long id) {
        super(String.format("Book with id not found "+id));
    }
}
