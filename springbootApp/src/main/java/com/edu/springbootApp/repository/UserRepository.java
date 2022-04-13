package com.edu.springbootApp.repository;

import com.edu.springbootApp.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User ,Long> {

    



}
