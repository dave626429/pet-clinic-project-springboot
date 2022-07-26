package com.testapp.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.testapp.models.Vet;
import com.testapp.services.VetServices;


@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetServices {
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save( object);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
