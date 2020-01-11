package com.mindtree.userlaptop.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.userlaptop.entity.Laptop;
import com.mindtree.userlaptop.entity.User;
import com.mindtree.userlaptop.repositary.LaptopRepo;
import com.mindtree.userlaptop.repositary.UserRepo;
import com.mindtree.userlaptop.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	LaptopRepo laptopRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		
     List<User> userlist=userRepo.findAll();
		
		return userlist;
	}

	@Override
	public List<Laptop> findLaptop() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Laptop> getLaptop(int userId) {
		// TODO Auto-generated method stub
		
		User user=userRepo.findById(userId).get();
		List<Laptop> laptoplist=user.getLaptoplist();
		
		return laptoplist;
	}

}
