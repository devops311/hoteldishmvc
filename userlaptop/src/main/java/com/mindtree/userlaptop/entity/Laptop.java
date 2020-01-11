package com.mindtree.userlaptop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int laptopId;
	private String laptopName;
	
	
	@ManyToOne
	private User user;


	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getLaptopId() {
		return laptopId;
	}


	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}


	public String getLaptopName() {
		return laptopName;
	}


	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Laptop(int laptopId, String laptopName, User user) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.user = user;
	}
	
	
	
	
}
