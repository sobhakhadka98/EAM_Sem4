package com.khadka.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.khadka.entity.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}
