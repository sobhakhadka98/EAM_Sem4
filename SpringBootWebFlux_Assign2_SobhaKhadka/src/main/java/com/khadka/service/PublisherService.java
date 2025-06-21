package com.khadka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khadka.entity.Publisher;
import com.khadka.repository.PublisherRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Transactional
@Service
@AllArgsConstructor
public class PublisherService {
	
	@Autowired
    private PublisherRepository publisherRepository;  // Using constructor injection

    public Flux<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Mono<Publisher> getPublisherById(String id) {
        return publisherRepository.findById(id);
    }

    public Mono<Publisher> savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public Mono<Publisher> updatePublisher(String id, Publisher publisher) {
        return publisherRepository.save(publisher);
    }
}
