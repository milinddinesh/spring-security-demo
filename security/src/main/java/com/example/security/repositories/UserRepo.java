package com.example.security.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.security.models.User;

public interface UserRepo extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}   
