package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	

}
