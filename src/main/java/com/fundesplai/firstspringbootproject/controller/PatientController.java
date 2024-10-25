package com.fundesplai.firstspringbootproject.controller;

import com.fundesplai.firstspringbootproject.entity.Patient;
import com.fundesplai.firstspringbootproject.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<Patient> listPatients(){
        List<Patient> patients = (List<Patient>) patientRepository.findAll();
        return patients;
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatient(@PathVariable("id") Integer id){
        Optional<Patient> patienteOptional = patientRepository.findById(id);
        return patienteOptional;
    }
}

