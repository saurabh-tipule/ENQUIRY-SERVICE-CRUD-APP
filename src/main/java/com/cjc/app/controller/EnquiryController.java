package com.cjc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@DeleteMapping(value = "/enquiries/{customerID}")
	public ResponseEntity<Void> deleteEnquiry(@PathVariable Integer customerID){
		Boolean flag = enquiryService.deleteEnquiry(customerID);
		if(flag) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
