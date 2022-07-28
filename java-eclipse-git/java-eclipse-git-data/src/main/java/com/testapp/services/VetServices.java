package com.testapp.services;

import java.util.Set;

import com.testapp.models.Vet;

public interface VetServices {

	Vet findById();

	Vet save(Vet vet);

	Set<Vet> findAll();

}
