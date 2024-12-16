package com.cjc.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
	public Enquiry saveEnquiry(Enquiry enquiry) {
		
		return enquiryRepository.save(enquiry);
	}
	@Override
	public Enquiry editEnquiry(int customerID, Enquiry enquiry) {
		if (enquiryRepository.existsById(customerID)) {
			Enquiry exitingEnquiry = enquiryRepository.findById(customerID).get();
			if (enquiry.getFirstName() != null) {
				exitingEnquiry.setFirstName(enquiry.getFirstName());
			}
			if (enquiry.getLastName() != null) {
				exitingEnquiry.setLastName(enquiry.getLastName());
			}
			if (enquiry.getAge() != null) {
				exitingEnquiry.setAge(enquiry.getAge());
			}
			if (enquiry.getMobileNo() != null) {
				exitingEnquiry.setMobileNo(enquiry.getMobileNo());
			}
			if (enquiry.getPancardNo() != null) {
				exitingEnquiry.setPancardNo(enquiry.getPancardNo());
			}
			return enquiryRepository.save(exitingEnquiry);
		}
		return null;

	}

}
