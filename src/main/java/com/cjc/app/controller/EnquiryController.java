package com.cjc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	
	

	@GetMapping(value = "/enquiries")
	public ResponseEntity<List<Enquiry>> getAllEnquiry()
	{
	  List<Enquiry> enquirylist= enquiryService.getAllEnquiry();
	  
	  if(enquirylist.isEmpty())
	  {
		  return new ResponseEntity<List<Enquiry>>(HttpStatus.NO_CONTENT);
	  }
	  return new ResponseEntity<List<Enquiry>>(enquirylist,HttpStatus.OK);
	}
	
	@GetMapping(value = "/enquiries/{customerid}")
	public ResponseEntity<Enquiry> getsingleEnquiry(@PathVariable Integer customerid)
	{
	   Enquiry enquiry = enquiryService.getsingleEnquiry(customerid);
	   
	   return new ResponseEntity<Enquiry>(enquiry,HttpStatus.OK);
	}
}
