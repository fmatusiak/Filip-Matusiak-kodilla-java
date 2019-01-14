package com.kodilla.spring.library;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class LibraryConfig {

    @Bean
    public Library library() {
        return new Library(libraryDbController());
    }

    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}
