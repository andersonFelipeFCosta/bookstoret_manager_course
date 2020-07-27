package br.com.affc.bookstoremanager.controller;

import br.com.affc.bookstoremanager.dto.MessageResponseDTO;
import br.com.affc.bookstoremanager.entity.Book;
import br.com.affc.bookstoremanager.repository.BookRepository;
import br.com.affc.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create( @RequestBody Book book){
          return  bookService.create(book);
    }
}
