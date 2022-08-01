package com.testapp.services;

import java.util.Set;

public interface BaseInterface<T, ID> {

	T findById(ID id);

	T save(T object);

	Set<T> findAll();

	void delete(T object);

	void deleteById(ID id);
}
