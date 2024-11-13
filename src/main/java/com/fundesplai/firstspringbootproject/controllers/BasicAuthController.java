package com.fundesplai.firstspringbootproject.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundesplai.firstspringbootproject.persistence.entities.User;
import com.fundesplai.firstspringbootproject.utils.JwtTokenUtil;


@RestController
public class BasicAuthController {

    @Autowired
    JwtTokenUtil jwtTokenUtil;

	@PostMapping(path = "/login")
	public ResponseEntity<String> basicauth(UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) {
        
        final String token = jwtTokenUtil.generateToken(usernamePasswordAuthenticationToken.getName());
        User user = (User) usernamePasswordAuthenticationToken.getPrincipal();
        return ResponseEntity.ok().body("{\"token\":\""+ token +"\" , \"id\":"+user.getId()+"}");
	}
}