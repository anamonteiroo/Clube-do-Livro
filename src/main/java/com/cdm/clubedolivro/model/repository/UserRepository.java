package com.cdm.clubedolivro.model.repository;

import com.cdm.clubedolivro.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmailAndDeleteDateIsNull();
    Optional<User> findByEmailAndDeleteDateIsNull(String email);
    Optional<User> findByIdAndDeleteDateIsNull(Long id);
    List<User> findAllWhereDeleteDateIsNull();
}
