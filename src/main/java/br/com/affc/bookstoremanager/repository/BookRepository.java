package br.com.affc.bookstoremanager.repository;

import br.com.affc.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {


}
