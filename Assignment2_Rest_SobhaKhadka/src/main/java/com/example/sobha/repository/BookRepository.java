package com.example.sobha.repository;

import com.example.sobha.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
