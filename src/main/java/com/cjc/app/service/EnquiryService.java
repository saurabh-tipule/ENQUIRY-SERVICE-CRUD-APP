package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Enquiry;

public interface EnquiryService {

	List<Enquiry> getAllEnquiry();

	Enquiry getsingleEnquiry(Integer customerid);

	

}
