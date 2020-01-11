package com.mindtree.userlaptop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private int userId;
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<Laptop>laptoplist;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, List<Laptop> laptoplist) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.laptoplist = laptoplist;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Laptop> getLaptoplist() {
		return laptoplist;
	}

	public void setLaptoplist(List<Laptop> laptoplist) {
		this.laptoplist = laptoplist;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", laptoplist=" + laptoplist + "]";
	}
	
	
	
}
