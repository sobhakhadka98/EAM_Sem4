package com.khadka.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.khadka.entity.Member;

public interface MemberRepository extends ReactiveMongoRepository<Member, String> {
}
