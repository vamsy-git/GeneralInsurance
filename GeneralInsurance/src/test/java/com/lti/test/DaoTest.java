package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.Dao1;
import com.lti.entity.Admin;

public class DaoTest {

	Dao1 dao = new Dao1();
	
	@Test
	public void addOrUpdate() {
		
		Admin a = new Admin();
		
		a.setAdmin_username("admin@123");
		a.setAdmin_email("admin123@gmail.com");
		a.setAdmin_password("admin@123");
		
		dao.addOrUpdate(a);
		
		System.out.println(a);
	}
}
