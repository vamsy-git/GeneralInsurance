package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.entity.Admin;

public class Dao1 {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	public Dao1() {
		emf = Persistence.createEntityManagerFactory("oracle_pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	public Admin addOrUpdate(Admin admin) {
		tx.begin();
		Admin admin1 = em.merge(admin);
		tx.commit();
		return admin1;
	}
}
