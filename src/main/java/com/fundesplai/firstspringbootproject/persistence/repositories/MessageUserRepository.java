package com.fundesplai.firstspringbootproject.persistence.repositories;

import com.fundesplai.firstspringbootproject.persistence.entities.MessageUser;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface MessageUserRepository extends CrudRepository<MessageUser, Integer> {
}
