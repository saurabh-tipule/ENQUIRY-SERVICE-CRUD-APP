package com.cjc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.service.EnquiryService;

@RestController
public class EnquiryController {

	private EnquiryService enquiryService;

	@Autowired
	public void setEnquiryService(EnquiryService enquiryService) {
		this.enquiryService = enquiryService;
	}

	// post -> priyanka

	// get All -> Komal

	// get Single-> komal

	// delete-> Manjusha

	// put -> Manjusha

	// patch -> Aman

}
