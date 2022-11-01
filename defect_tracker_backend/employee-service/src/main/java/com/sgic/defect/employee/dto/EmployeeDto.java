package com.sgic.defect.employee.dto;

import com.sgic.defect.employee.entities.Designation;

public class EmployeeDto {
	private  Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String nicNumber;
	private String address;
	private Integer mobileNumber;
	private Designation designation;
	
	
	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public  Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNicNumber() {
		return nicNumber;
	}
	public void setNicNumber(String nicNumber) {
		this.nicNumber = nicNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
