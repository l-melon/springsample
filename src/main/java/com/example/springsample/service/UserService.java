package com.example.springsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsample.entity.User;
import com.example.springsample.repository.UserRepository;
/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    
    public List<User> searchAll() {
        return userRepository.findAll();
    }
}