package com.testapp.models;

import java.time.LocalDate;

import com.testapp.entities.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Pet extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	private PetType type;
	private Owner owner;
	private LocalDate dob;

}
