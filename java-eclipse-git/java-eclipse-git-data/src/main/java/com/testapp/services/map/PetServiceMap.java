package com.testapp.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.testapp.models.Pet;
import com.testapp.services.PetServices;


@Service
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetServices {
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save( object);
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
