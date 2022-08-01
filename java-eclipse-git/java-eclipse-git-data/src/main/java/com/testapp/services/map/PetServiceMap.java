package com.testapp.services.map;

import java.util.Set;

import com.testapp.models.Pet;
import com.testapp.services.BaseInterface;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements BaseInterface<Pet, Long> {
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
