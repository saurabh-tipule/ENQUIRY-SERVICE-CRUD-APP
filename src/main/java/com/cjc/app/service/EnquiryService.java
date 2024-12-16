package com.cjc.app.service;

import com.cjc.app.model.Enquiry;

public interface EnquiryService {

	Enquiry editEnquiry(int customerID, Enquiry enquiry);

	Enquiry saveEnquiry(Enquiry enquiry);

}
