package com.cjc.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.cjc.app.enquaryenum.EnquiryStatus;

import lombok.Data;

@Entity
@Data
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerID;

	private String firstName;

	private String lastName;

	private Integer age;

	private String email;

	private Long mobileNo;

	private String pancardNo;
	
	@CreationTimestamp
	private Date registeredDate;
	
	@Enumerated(EnumType.STRING)
	private EnquiryStatus enquiryStatus;
	
	

}
