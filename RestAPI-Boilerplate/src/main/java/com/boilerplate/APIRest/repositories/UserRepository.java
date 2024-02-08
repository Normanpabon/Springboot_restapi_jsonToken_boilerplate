package com.boilerplate.APIRest.repositories;

import com.boilerplate.APIRest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // permits return null if not user is found
    Optional<User> findByUsername(String username);
}
