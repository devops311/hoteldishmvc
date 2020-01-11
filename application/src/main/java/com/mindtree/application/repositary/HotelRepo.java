package com.mindtree.application.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.application.entity.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer> {

	boolean existsByName(String name);

	//boolean existsByHotelName(String hotelName);

	
	
}
