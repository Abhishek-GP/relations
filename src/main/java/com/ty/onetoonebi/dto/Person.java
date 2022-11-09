package com.ty.onetoonebi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int personId;
private String name;
private int age;
private String gender;
private String address;
@OneToOne
@JoinColumn
private AadhaarCard card;
public int getId() {
	return personId;
}
public void setId(int id) {
	this.personId = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public AadhaarCard getCard() {
	return card;
}
public void setCard(AadhaarCard card) {
	this.card = card;
}
@Override
public String toString() {
	return "Person [id=" + personId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
			+ ", card=" + card + "]";
}

}
