package com.khadka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khadka.entity.Book;
import com.khadka.entity.Member;
import com.khadka.repository.BookRepository;
import com.khadka.repository.MemberRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Transactional
@Service
@AllArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository = null;

    public Flux<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Mono<Member> getMemberById(String id) {
        return memberRepository.findById(id);
    }

    public Mono<Member> saveMember(Member member) {
        return memberRepository.save(member);
    }

    public Mono<Member> updateMember(String id, Member member) {
        return memberRepository.save(member);
    }
}
