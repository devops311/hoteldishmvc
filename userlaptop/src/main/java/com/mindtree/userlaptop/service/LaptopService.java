package com.mindtree.userlaptop.service;

import java.util.List;

import com.mindtree.userlaptop.entity.Laptop;

public interface LaptopService {

	List<Laptop> findAll();

	void addValues(int laptopId, int userId);

}
