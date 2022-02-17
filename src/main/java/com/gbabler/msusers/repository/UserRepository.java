package com.gbabler.msusers.repository;

import com.gbabler.msusers.model.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDomain, Integer> {
}