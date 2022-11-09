package com.ty.onetoonebi.dao;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.AadhaarCard;
import com.ty.onetoonebi.dto.Person;

public class PersonDao {
public void savePerson(Person person) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abhi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	AadhaarCard card=person.getCard();
	entityTransaction.begin();
//	entityManager.persist(card);
	entityManager.persist(person);
	entityManager.persist(person.getCard());
	entityTransaction.commit();
}

public Person findPerson(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ab");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Person person=entityManager.find(Person.class, id);
	return person;
	
}
}
