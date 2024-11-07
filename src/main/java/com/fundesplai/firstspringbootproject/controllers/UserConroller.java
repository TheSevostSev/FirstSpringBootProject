package com.fundesplai.firstspringbootproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundesplai.firstspringbootproject.persistence.entities.User;
import com.fundesplai.firstspringbootproject.persistence.repositories.UserRepository;

@CrossOrigin
@RestController
public class UserConroller {

	@Autowired
	UserRepository userRepository;

	@GetMapping(path = "/users")
	public List<User> listUsers() {
		return (List<User>) userRepository.findAll();

	}
}