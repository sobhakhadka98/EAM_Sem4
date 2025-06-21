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
import com.khadka.entity.Member;
import com.khadka.service.BookService;
import com.khadka.service.MemberService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/members")
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService = new MemberService();

    // Get all members
    @GetMapping
    public Flux<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    // Get a member by ID
    @GetMapping("/{id}")
    public Mono<Member> getMemberById(@PathVariable String id) {
        return memberService.getMemberById(id);
    }

    // Add a new member
    @PostMapping
    public Mono<Member> saveMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    // Update an existing member by ID
    @PutMapping("/{id}")
    public Mono<Member> updateMember(@PathVariable String id, @RequestBody Member member) {
        return memberService.updateMember(id, member);
    }

}

