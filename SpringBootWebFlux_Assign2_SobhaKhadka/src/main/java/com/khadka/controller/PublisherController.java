package com.khadka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadka.entity.Book;
import com.khadka.entity.Publisher;
import com.khadka.service.BookService;
import com.khadka.service.PublisherService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/publishers")
@AllArgsConstructor
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    // Get all publishers
    @GetMapping
    public Flux<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    // Get a publisher by ID
    @GetMapping("/{id}")
    public Mono<Publisher> getPublisherById(@PathVariable String id) {
        return publisherService.getPublisherById(id);
    }

    // Add a new publisher
    @PostMapping
    public Mono<Publisher> savePublisher(@RequestBody Publisher publisher) {
        return publisherService.savePublisher(publisher);
    }

    // Update an existing publisher by ID
    @PutMapping("/{id}")
    public Mono<Publisher> updatePublisher(@PathVariable String id, @RequestBody Publisher publisher) {
        return publisherService.updatePublisher(id, publisher);
    }

}

