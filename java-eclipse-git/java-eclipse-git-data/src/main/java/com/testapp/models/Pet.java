package com.testapp.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pet {
	
	private PetType type;
	private Owner owner;
	private LocalDate dob;

}
