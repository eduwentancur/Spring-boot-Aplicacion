package com.edu.springbootApp.services;

import com.edu.springbootApp.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    
    public Iterable<User> getAllUsers();

}
