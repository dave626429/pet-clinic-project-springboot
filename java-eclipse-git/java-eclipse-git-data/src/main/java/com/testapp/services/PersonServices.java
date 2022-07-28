package com.testapp.services;

import java.util.Set;

import com.testapp.models.Person;

public interface PersonServices {
	
	Person findById();
	
	Person save(Person person);
	
	Set<Person> findAll();

}
