package com.testapp.services.map;

import java.util.Set;

import com.testapp.models.Vet;
import com.testapp.services.BaseInterface;

public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements BaseInterface<Vet, Long> {
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
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
