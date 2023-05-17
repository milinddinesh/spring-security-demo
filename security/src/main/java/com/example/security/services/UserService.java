package com.example.security.services;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.p assword.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.security.repositories.UserRepo;
import com.example.security.models.User;

@Service
public class UserService {
    private final UserRepo repo;

    // @Autowired
    // private PasswordEncoder passwordEncoder;

    public UserService(UserRepo repo){
        this.repo = repo;
    }

    public boolean login(String username,String password){
        User user =  repo.findByUsername(username);
        if (user != null){
            if (user.getPassword() == password){
                return true;
            } 
            else {
                return false;
            }
        }
        else { return false; }
    }

}
