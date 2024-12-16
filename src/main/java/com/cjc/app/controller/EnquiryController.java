package com.cjc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<Enquiry>saveEnquiry(@RequestBody Enquiry enquiry)
	{
		Enquiry saveEnquiry=enquiryService.saveEnquiry(enquiry);
		return new ResponseEntity<Enquiry>(saveEnquiry, HttpStatus.CREATED);
	}
	@PatchMapping(value = "/enquiries/{customerID}")
	public ResponseEntity<Enquiry> editEnquiry(@PathVariable int customerID, @RequestBody Enquiry enquiry) {
		Enquiry editEnquiry = enquiryService.editEnquiry(customerID, enquiry);
		if (editEnquiry != null) {
			return new ResponseEntity<Enquiry>(editEnquiry, HttpStatus.OK);
		}
		return new ResponseEntity<Enquiry>(HttpStatus.NOT_FOUND);

	}

}
