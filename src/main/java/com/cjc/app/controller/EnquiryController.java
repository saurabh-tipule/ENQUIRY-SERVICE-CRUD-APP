package com.cjc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.model.Enquiry;
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

	@PostMapping(value = "/enquiries")
	public ResponseEntity<Enquiry> saveEnquiry(@RequestBody Enquiry enquiry) {
		Enquiry enq = enquiryService.addEnquiry(enquiry);

		return new ResponseEntity<Enquiry>(enq, HttpStatus.CREATED);
	}

}
