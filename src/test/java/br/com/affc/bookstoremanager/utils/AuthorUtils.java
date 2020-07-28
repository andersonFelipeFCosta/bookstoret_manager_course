package br.com.affc.bookstoremanager.utils;

import br.com.affc.bookstoremanager.dto.AuthorDTO;
import br.com.affc.bookstoremanager.entity.Author;
import com.github.javafaker.Faker;

public class AuthorUtils {
    private static final Faker faker = Faker.instance();

    public static AuthorDTO createFakeAuthorDTO() {
        return AuthorDTO.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0,100))
                .build();
    }

    public static Author createFakeAuthor() {
        return Author.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().author())
                .age(faker.number().numberBetween(0,100))
                .build();
    }
}
