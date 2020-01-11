package com.mindtree.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.application.entity.Dish;
import com.mindtree.application.entity.Hotel;
import com.mindtree.application.exception.ControllerException;
import com.mindtree.application.service.DishService;
import com.mindtree.application.service.HotelService;



@Controller
public class AppRunner {

	
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	DishService dishService;
	
	
    
    @RequestMapping("/")
    public String login() {
        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal());
        return "/login";
    }
    
    @RequestMapping("/callback")
    public String callback() {
        System.out.println("redirecting to home page");
        return "/index";
    }

	
	
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/addhotel")
	public String addbank() {
		return "hotelreg";
	}

	@PostMapping("/inserthotel")
	public String inserthotel(Hotel hotel) throws ControllerException {

		hotelService.addValues(hotel);

		return "index";

	}
	@GetMapping("/adddish")
	public String adddish() {
		return "dishreg";
	}

	@PostMapping("/insertdish")
	public String insertdish(Dish dish) throws ControllerException {

		dishService.addValues(dish);

		return "index";

	}
	
	
	@RequestMapping("/assign")
	public String assignit(Model model)
	{
		
		List<Hotel> hotellist = hotelService.findAll();

		model.addAttribute("hotel", hotellist);

		List<Dish> dishlist = dishService.findAll();

		model.addAttribute("dish", dishlist);
		
		
		return "assigadishtohotel";
		
	}
	@RequestMapping("/assignit")
	public String assignValues(@RequestParam int hotelId, @RequestParam int dishId) {
		dishService.addValues(hotelId,dishId);

		return "index";
	}

	@RequestMapping("/details")
	public String details(Model model)
	{
		List<Hotel> hotellist=hotelService.getAllHotel();
		
		model.addAttribute("hotel", hotellist);
		return "displayhotel";
		
	}
	
	
	@RequestMapping("/delete")
	public String del() {
		return "delpage";
	}

	@RequestMapping("/deleteId")
	public String dele(@RequestParam int dishId) throws ControllerException {

		dishService.deleteUser(dishId);
		return "index";
	}

	
	
	@RequestMapping("/updatedish")
	public String update(Model model)
	{
       List<Dish> dishlist=dishService.getAllDish();
		
		model.addAttribute("dish",dishlist);
		
		return "dishes";
		
		
		
	}
	
	@PostMapping("/updatedish1")
	public String updatedish(@RequestParam String name,@RequestParam int rate,@RequestParam int price) throws ControllerException
	{
		
		dishService.update(name,rate,price);
		
		
		return "index";
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
