package com.mindtree.userlaptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.userlaptop.entity.Laptop;
import com.mindtree.userlaptop.entity.User;
import com.mindtree.userlaptop.service.LaptopService;
import com.mindtree.userlaptop.service.UserService;

@Controller
public class AppRunner {

	@Autowired
	UserService userService;

	@Autowired
	LaptopService laptopService;

	@RequestMapping("/")
	public String home() {
		return "index";

	}

	@RequestMapping("/assignuserlap")
	public String assign(Model model) {
		List<User> userlist = userService.findAll();

		model.addAttribute("user", userlist);
		List<Laptop> laptoplist = laptopService.findAll();

		model.addAttribute("laptop", laptoplist);
		
		return "assign";

	}

	       @RequestMapping("/assignusertolaptop")
	       public String assignValues(@RequestParam int userId,@RequestParam int laptopId)
	       {
	    	   laptopService.addValues(laptopId,userId);
	    	   
			    return "index";
	       }
	
	       @RequestMapping("/laptopunderuser")
	       public String assignValues(Model model)
	       {
	    	   List<User> userlist=userService.findAll();
	    	   
	    	   
	    	   model.addAttribute("user", userlist);
			    return "userid";
	       }
	       
	       @RequestMapping("/getlaptop")
	       public String getlaptoplist(@RequestParam int userId,Model model)
	       {
	    	   List<Laptop>laptoplist=userService.getLaptop(userId);
	           
	    	   model.addAttribute("laptop", laptoplist);
	    	   
	    	   return "showlaptop";
	       
	       }
	       
	       
	       
	       
	       
	       
	       
}       
	       

