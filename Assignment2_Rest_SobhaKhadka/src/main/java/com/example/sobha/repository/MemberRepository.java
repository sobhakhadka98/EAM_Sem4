package com.example.sobha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sobha.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
