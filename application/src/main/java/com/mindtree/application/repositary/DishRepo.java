package com.mindtree.application.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.application.entity.Dish;

@Repository
public interface DishRepo extends JpaRepository<Dish,Integer> {

	boolean existsByName(String name);

	Optional<Dish> findByName(String name);

}
