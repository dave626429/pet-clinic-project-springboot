package com.testapp.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.testapp.entities.BaseEntity;

public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(T object) {

		try {
			if (object != null) {
				if (object.getId() == null) {
					object.setId(genID());
				}
			} else {
				throw new RuntimeException("Object can not be null");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		map.put(object.getId(), object);

		return object;
	}

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	};

	public void delete(T object) {
		map.entrySet().removeIf(entity -> entity.equals(object));
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	private Long genID() {
		Long id = 1000001L;

		if (map.size() > 0) {
			id = Collections.max(map.keySet()) + 1;
		}

		return id;
	}

}
