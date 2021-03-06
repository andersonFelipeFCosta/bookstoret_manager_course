package br.com.affc.bookstoremanager.service;

import br.com.affc.bookstoremanager.dto.AuthorDTO;
import br.com.affc.bookstoremanager.dto.BookDTO;
import br.com.affc.bookstoremanager.dto.MessageResponseDTO;
import br.com.affc.bookstoremanager.entity.Book;
import br.com.affc.bookstoremanager.exception.BookNotFoundException;
import br.com.affc.bookstoremanager.mapper.BookMapper;
import br.com.affc.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;
    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){

           Book bookToSave = bookMapper.toModel(bookDTO);
           Book savedBook = bookRepository.save(bookToSave);
           return (MessageResponseDTO) MessageResponseDTO.builder().message("Book created with *ID "+ savedBook.getId() ).build();
    }

    public BookDTO findById(Long id) throws BookNotFoundException {
       Book book = bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException(id));
        return bookMapper.toDTO(book);
    }
}
