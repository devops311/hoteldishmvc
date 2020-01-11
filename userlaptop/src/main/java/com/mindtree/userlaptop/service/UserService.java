package com.mindtree.userlaptop.service;

import java.util.List;

import com.mindtree.userlaptop.entity.Laptop;
import com.mindtree.userlaptop.entity.User;

public interface UserService {

	List<User> findAll();

	List<Laptop> findLaptop();

	List<Laptop> getLaptop(int userId);

}
