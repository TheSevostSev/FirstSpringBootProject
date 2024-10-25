package com.fundesplai.firstspringbootproject.repository;
import com.fundesplai.firstspringbootproject.entity.Patient;
import org.springframework.data.repository.CrudRepository;


public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
