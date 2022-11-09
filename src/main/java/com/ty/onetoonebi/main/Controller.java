package com.ty.onetoonebi.main;

import com.ty.onetoonebi.dao.PersonDao;
import com.ty.onetoonebi.dto.AadhaarCard;
import com.ty.onetoonebi.dto.Person;

public class Controller {

	public static void main(String[] args) {
Person person=new Person();
person.setName("jagadish");
person.setAge(25);
person.setGender("male");
person.setAddress("bangalore");


AadhaarCard pancard=new AadhaarCard();
pancard.setName("jagadish n");
pancard.setAadhaarCardNo("bwmpas2424");

person.setCard(pancard);
pancard.setPerson(person);

PersonDao dao=new PersonDao();
dao.savePerson(person);
//PersonDao dao=new PersonDao();
//dao.savePerson(person);
//System.out.println(dao);

	}

}
