package com.fundesplai.firstspringbootproject.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate chargeDate = LocalDate.now();  
    private LocalDate dischargeDate;

    public Patient() {
       
    }

    public Patient(String firstName, String lastName, LocalDate dischargeDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.chargeDate = LocalDate.now();  
        this.dischargeDate = dischargeDate;
    }
}
