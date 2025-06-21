package com.khadka.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.khadka.entity.Publisher;


@Repository
public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {
}