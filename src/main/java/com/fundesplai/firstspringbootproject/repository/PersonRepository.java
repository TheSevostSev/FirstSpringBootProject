package com.fundesplai.firstspringbootproject.repository;

import com.fundesplai.firstspringbootproject.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {
}
