package com.mindtree.userlaptop.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.userlaptop.entity.Laptop;
import com.mindtree.userlaptop.entity.User;
import com.mindtree.userlaptop.repositary.LaptopRepo;
import com.mindtree.userlaptop.repositary.UserRepo;
import com.mindtree.userlaptop.service.LaptopService;
@Service
public class LaptopServiceImpl implements LaptopService {

	
	@Autowired
	LaptopRepo laptopRepo;
	
	@Autowired
	UserRepo userRepo;
	
	
	@Override
	public List<Laptop> findAll() {
		
		List<Laptop> laptoplist=laptopRepo.findAll();
		
		return laptoplist;
	}

	@Override
	public void addValues(int laptopId, int userId) {
		// TODO Auto-generated method stub
		
		User user=userRepo.findById(userId).get();
		Laptop laptop=laptopRepo.findById(laptopId).get();
		
		laptop.setUser(user);
		
		
		laptopRepo.save(laptop);
	}

}
