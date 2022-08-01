package com.testapp.services.map;

import java.util.Set;

import com.testapp.models.Owner;
import com.testapp.services.BaseInterface;

public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements BaseInterface<Owner, Long> {

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
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

}
