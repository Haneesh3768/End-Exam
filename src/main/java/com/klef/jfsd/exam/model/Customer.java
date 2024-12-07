package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer 
{
	
	@Id
	@Column(name="cid",nullable=false,length = 30)
	private int id;
	@Column(name="cname",nullable=false,length = 30)
	private String name;
	@Column(name="cemail",nullable=false,length = 30,unique = true)
	private String email;
	@Column(name="ccontact",nullable=false,length = 30,unique = true)
	private String contact;
	@Column(name="caddress",nullable=false,length = 30)
	private String address;
	@Column(name="cdob",nullable=false,length = 30)
	private String dob;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
