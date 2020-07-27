package br.com.affc.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String nome;
    @Column(nullable= false)
    private Integer pager;
    @Column(nullable= false)
    private Integer chapters;
    @Column(nullable= false)
    private String isbn;
    @Column(name = "publisher_name",nullable = false, unique = true)
    private String publisherName;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST ,CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name = "author_id")
    private Author author;
    public void author (){
        author.getNome();
    }

}
