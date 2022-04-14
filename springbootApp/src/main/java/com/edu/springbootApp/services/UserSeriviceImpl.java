package com.edu.springbootApp.services;

import com.edu.springbootApp.entity.User;
import com.edu.springbootApp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSeriviceImpl implements UserService {

    @Autowired
    UserRepository repository ; 

    @Override
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }
    
    

    

    
}
