package com.mindtree.application.service;

import java.util.List;

import com.mindtree.application.entity.Hotel;
import com.mindtree.application.exception.ControllerException;

public interface HotelService {

	void addValues(Hotel hotel) throws ControllerException;

	List<Hotel> findAll();

	//void getAll();

	List<Hotel> getAllHotel();

}
