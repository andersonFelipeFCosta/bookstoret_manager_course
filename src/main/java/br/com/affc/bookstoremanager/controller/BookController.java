package br.com.affc.bookstoremanager.controller;

import br.com.affc.bookstoremanager.dto.BookDTO;
import br.com.affc.bookstoremanager.dto.MessageResponseDTO;
import br.com.affc.bookstoremanager.entity.Book;
import br.com.affc.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/app/v1/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create( @RequestBody @Valid BookDTO bookDTO){
        return  bookService.create(bookDTO);
    }
    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id){
        return  bookService.findById(id);
    }
}
