package com.cjc.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.model.Enquiry;
import com.cjc.app.repository.EnquiryRepository;
import com.cjc.app.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	private EnquiryRepository enquiryRepository;

	@Autowired
	public void setEnquiryRepository(EnquiryRepository enquiryRepository) {
		this.enquiryRepository = enquiryRepository;
	}

	@Override
	public Boolean deleteEnquiry(Integer customerID) {
		if(enquiryRepository.existsById(customerID)) {
			enquiryRepository.deleteById(customerID);
		     return true;
			}
		return false;
	}
}
