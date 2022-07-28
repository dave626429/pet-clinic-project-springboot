package com.testapp.models;

import com.testapp.entities.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;

}
