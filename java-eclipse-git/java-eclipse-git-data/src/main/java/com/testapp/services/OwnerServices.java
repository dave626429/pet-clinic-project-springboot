package com.testapp.services;

import com.testapp.models.Owner;

public interface OwnerServices extends BaseInterface<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
