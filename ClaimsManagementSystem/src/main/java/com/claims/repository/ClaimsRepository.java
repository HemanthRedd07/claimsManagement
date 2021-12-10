package com.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claims.model.Claims;

@Repository
public interface ClaimsRepository extends JpaRepository<Claims,Integer> {

}
