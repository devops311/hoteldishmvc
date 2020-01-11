package com.mindtree.application.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.application.entity.Hotel;
import com.mindtree.application.exception.ControllerException;
import com.mindtree.application.repositary.DishRepo;
import com.mindtree.application.repositary.HotelRepo;
import com.mindtree.application.service.HotelService;



@Service
public class HotelServiceImpl implements HotelService {

	
	@Autowired
	DishRepo dishRepo;
	
	@Autowired
	HotelRepo hotelRepo;

	@Override
	public void addValues(Hotel hotel) throws ControllerException {
		// TODO Auto-generated method stub
	
		if(hotelRepo.existsByName(hotel.getName()))
		{
			
			throw new ControllerException("HOTEL ID ALREADY PRESENT");
		}
		else
		
		
		   hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> findAll() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
		
	
	}

	@Override
	public List<Hotel> getAllHotel() {
		
		
		
		return hotelRepo.findAll();
	}
}
