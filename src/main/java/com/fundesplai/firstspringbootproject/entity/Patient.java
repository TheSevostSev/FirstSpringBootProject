package com.fundesplai.firstspringbootproject.entity;


import java.util.Date;

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
	private Date dischargeDate;

	public Patient(){}

	public Patient(String firstName, String lastName, Date dischargeDate){
		this.firstName=firstName;
		this.lastName=lastName;
		this.dischargeDate=dischargeDate;
	}

}
