package com.khadka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khadka.entity.Book;
import com.khadka.repository.BookRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Transactional
@Service
@AllArgsConstructor
public class BookService {
    
    // Use @Autowired to ensure Spring injects the repository
    @Autowired
    private BookRepository bookRepository;

    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Mono<Book> getBookById(String id) {
        return bookRepository.findById(id);
    }

    public Mono<Book> saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Mono<Book> updateBook(String id, Book book) {
        return bookRepository.save(book);
    }
}
