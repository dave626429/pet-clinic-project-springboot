package com.testapp.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.testapp.models.Owner;
import com.testapp.services.OwnerServices;

@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerServices {

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save( object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
