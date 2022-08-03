package com.testapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.testapp.models.Owner;
import com.testapp.models.Vet;
import com.testapp.services.OwnerServices;
import com.testapp.services.VetServices;

@Component
public class DataLoader implements CommandLineRunner {

	private final VetServices vetService;
	private final OwnerServices ownerServices;

	@Autowired
	public DataLoader(VetServices vetService, OwnerServices ownerServices) {
		super();
		this.vetService = vetService;
		this.ownerServices = ownerServices;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner_1 = new Owner();
		owner_1.setFirstName("Davinder");
		owner_1.setLastName("Singh");

		Owner owner_2 = new Owner();
		owner_2.setFirstName("Mandeep");
		owner_2.setLastName("Singh");

		ownerServices.save(owner_1);
		ownerServices.save(owner_2);

		System.out.println("*****Owner created*****");

		Vet vet_1 = new Vet();

		vet_1.setFirstName("Aaron");
		vet_1.setLastName("");

		Vet vet_2 = new Vet();

		vet_2.setFirstName("Azizmullah");
		vet_2.setLastName("Gaddar");

		vetService.save(vet_1);
		vetService.save(vet_2);

		System.out.println("*****Vet created*****");

	}

}
