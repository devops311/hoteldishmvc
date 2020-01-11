package com.mindtree.application.service;

import java.util.List;

import com.mindtree.application.entity.Dish;
import com.mindtree.application.exception.ControllerException;

public interface DishService {

	void addValues(Dish dish) throws ControllerException;

	List<Dish> findAll();

	void addValues(int hotelId, int dishId);

	void deleteUser(int dishId) throws ControllerException;

	List<Dish> getAllDish();

	void update(String name, int rate, int price) throws ControllerException;



}
