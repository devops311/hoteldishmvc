package com.mindtree.application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dish {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dishId;
	private String name;
	private int rate;
	private int price;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Hotel hotel;

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dish(int dishId, String name, int rate, int price, Hotel hotel) {
		super();
		this.dishId = dishId;
		this.name = name;
		this.rate = rate;
		this.price = price;
		this.hotel = hotel;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
}
