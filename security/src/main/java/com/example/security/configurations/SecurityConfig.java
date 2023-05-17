package com.example.security.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
        http
        .csrf().disable()
        .authorizeHttpRequests((authorize)->
        authorize.requestMatchers("/auth/**","/test").permitAll()
        // .requestMatchers(HttpMethod.POST,"/auth/register").permitAll()
        );
        return http.build();
    }
}



