package com.testapp.services.map;

import java.util.Set;

import com.testapp.models.Person;
import com.testapp.services.BaseInterface;

public class PersonServiceMap extends AbstractServiceMap<Person, Long> implements BaseInterface<Person, Long> {
	@Override
	public Person findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Person save(Person object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Person> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Person object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
