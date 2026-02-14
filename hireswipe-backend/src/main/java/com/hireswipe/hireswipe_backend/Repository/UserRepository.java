package com.hireswipe.hireswipe_backend.Repository;

import com.hireswipe.hireswipe_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
