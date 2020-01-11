package com.mindtree.userlaptop.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.userlaptop.entity.Laptop;

@Repository
public interface LaptopRepo  extends JpaRepository<Laptop,Integer> {

}
