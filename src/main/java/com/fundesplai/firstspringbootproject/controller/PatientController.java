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

    @PostMapping("/")
    public void createPatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable("id") Integer id){
        Patient patient = new Patient();
        patient.setId(id);
        patientRepository.delete(patient);
    }

    @PutMapping("/{id}")
    public void updatePatient(@RequestBody Patient patient, @PathVariable("id") Integer id){
        patient.setId(id);
        patientRepository.save(patient);
    }
}

