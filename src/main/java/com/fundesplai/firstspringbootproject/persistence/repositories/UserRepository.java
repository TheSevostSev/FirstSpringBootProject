package com.fundesplai.firstspringbootproject.persistence.repositories;

import com.fundesplai.firstspringbootproject.persistence.entities.User;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUserName(String username);

}
