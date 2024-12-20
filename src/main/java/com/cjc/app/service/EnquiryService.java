package com.cjc.app.service;

import com.cjc.app.model.Enquiry;

public interface EnquiryService {

	Boolean deleteEnquiry(Integer customerID);

	Enquiry addEnquiry(Enquiry enquiry);

}
