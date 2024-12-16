package com.cjc.app.serviceimpl;

import java.util.List;
import java.util.Optional;

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
	public List<Enquiry> getAllEnquiry() {

		return enquiryRepository.findAll();
	}

	@Override
	public Enquiry getsingleEnquiry(Integer customerId) {

		Optional<Enquiry> id = enquiryRepository.findById(customerId);
		if (id.isPresent()) {
			return id.get();
		}
		return null;
	}

}
