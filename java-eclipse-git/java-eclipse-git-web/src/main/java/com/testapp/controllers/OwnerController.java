package com.testapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testapp.services.OwnerServices;

@Controller
public class OwnerController {
	
	private final OwnerServices ownerservice;
	
	@Autowired
	public OwnerController(OwnerServices ownerservice) {
		super();
		this.ownerservice = ownerservice;
	}

	@RequestMapping({"/owners","/owners/index","/owners/index.html"})
	public String getOwners(Model model) {
		model.addAttribute("owners",ownerservice.findAll());
		return "owners/index";
	}

}
