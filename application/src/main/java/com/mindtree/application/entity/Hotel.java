package com.mindtree.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelId;
	private String name;
	private int avgRate;
	

	@OneToMany(mappedBy = "hotel", cascade = CascadeType.PERSIST)
	private List<Dish> dishlist;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int hotelId, String name, int avgRate, List<Dish> dishlist) {
		super();
		this.hotelId = hotelId;
		this.name = name;
		this.avgRate = avgRate;
		this.dishlist = dishlist;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAvgRate() {
		return avgRate;
	}

	public void setAvgRate(int avgRate) {
		this.avgRate = avgRate;
	}

	public List<Dish> getDishlist() {
		return dishlist;
	}

	public void setDishlist(List<Dish> dishlist) {
		this.dishlist = dishlist;
	}

	
}
