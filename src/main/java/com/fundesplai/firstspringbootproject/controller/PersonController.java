package com.fundesplai.firstspringbootproject.controller;

import com.fundesplai.firstspringbootproject.entity.Person;
import com.fundesplai.firstspringbootproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> selectPeople(){
        List<Person> people = (List<Person>) personRepository.findAll();
        return people;
    }

    @PostMapping("/")
    public void createPeople(@RequestBody Person person) {
        personRepository.save(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") Integer id){
        Person person = new Person();
        person.setId(id);
        personRepository.delete(person);
    }
}
