package com.ty.onetoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadhaarCard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int adhaarId;
private String name;
private String aadhaarCardNo;

@OneToOne(mappedBy = "card")
private Person person;

public int getAdhaarId() {
	return adhaarId;
}
public void setAdhaarId(int adhaarId) {
	this.adhaarId = adhaarId;
}
public String getAadhaarCardNo() {
	return aadhaarCardNo;
}
public void setAadhaarCardNo(String aadhaarCardNo) {
	this.aadhaarCardNo = aadhaarCardNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}


}
