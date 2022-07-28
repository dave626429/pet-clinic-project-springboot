package com.testapp.services;

import java.util.Set;

import com.testapp.models.Owner;

public interface OwnerServices {
	
	Owner findById();
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
