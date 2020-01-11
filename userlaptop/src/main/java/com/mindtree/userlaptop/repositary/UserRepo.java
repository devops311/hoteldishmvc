package com.mindtree.userlaptop.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.userlaptop.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
