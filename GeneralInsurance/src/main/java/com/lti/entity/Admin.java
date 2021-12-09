package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Admin {

	@Id
	@SequenceGenerator(name = "ad_seq", initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "ad_seq", strategy = GenerationType.SEQUENCE)
	int admin_id;
	String admin_username;
	String admin_email;
	String admin_password;
	
	public Admin() {
		
	}
	
	public Admin(int admin_id, String admin_username, String admin_email, String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_username = admin_username;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_username() {
		return admin_username;
	}

	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_username=" + admin_username + ", admin_email=" + admin_email
				+ ", admin_password=" + admin_password + "]";
	}
	
	
}
