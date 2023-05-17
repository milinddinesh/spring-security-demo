package com.example.security.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer allocation_id;

    @Column(nullable = false,unique = true)
    String username;
    @Column(nullable = false,unique = true)
    String email;
    @Column(nullable = false,unique = true)
    String password;

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String uname){
        username = uname;
    }

    public void setEmail(String mail){
        email = mail;
    }

    public void setPassword(String pass){
        password = pass;
    }

}
