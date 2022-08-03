package com.testapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testapp.services.VetServices;

@Controller
public class VetController {
	
	private final VetServices vetServices;
	
	@Autowired
	public VetController(VetServices vetServices) {
		super();
		this.vetServices = vetServices;
	}
	
	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String getVets(Model model) {
		model.addAttribute("vets", vetServices.findAll());
		return "vets/index";
	}

}
