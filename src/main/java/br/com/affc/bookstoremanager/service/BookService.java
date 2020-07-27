package br.com.affc.bookstoremanager.service;

import br.com.affc.bookstoremanager.dto.MessageResponseDTO;
import br.com.affc.bookstoremanager.entity.Book;
import br.com.affc.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        if(book != null) {
            Book savedBook = bookRepository.save(book);
            return MessageResponseDTO.builder().message("Book created with ID" + savedBook.getId()).build();
        }else{
            return MessageResponseDTO.builder().message("No records found!").build();
        }
    }
}
