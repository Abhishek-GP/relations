package com.ty.onetoonebi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoonebi.dto.AadhaarCard;
import com.ty.onetoonebi.dto.Person;

public class AadhaarCardDao {
public void savecard(AadhaarCard pancard) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abhi");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	Person person =pancard.getPerson();
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pancard);
	entityTransaction.commit();
}
public AadhaarCard findcard(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ab");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	AadhaarCard card=entityManager.find(AadhaarCard.class, id);
	return card;
}
}
