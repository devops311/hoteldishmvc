package com.mindtree.application.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.application.entity.Dish;
import com.mindtree.application.entity.Hotel;
import com.mindtree.application.exception.ControllerException;
import com.mindtree.application.repositary.DishRepo;
import com.mindtree.application.repositary.HotelRepo;
import com.mindtree.application.service.DishService;

@Service
public class DishServiceImpl implements DishService {

	@Autowired
	DishRepo dishRepo;

	@Autowired
	HotelRepo hotelRepo;

	@Override
	public void addValues(Dish dish) throws ControllerException {
		// TODO Auto-generated method stub

		if (dish.getRate() > 0 && dish.getRate() <= 10) {
			if (dish.getPrice() > 1) {
				dishRepo.save(dish);
			} else {
				throw new ControllerException("INVALID PRICE CAN'T REGISTER");
			}

		} else {
			throw new ControllerException("INVALID RATE .CAN'T REGISTER");
		}

	}

	@Override
	public List<Dish> findAll() {
		// TODO Auto-generated method stub

		return dishRepo.findAll();
		// return null;
	}

	@Override
	public void addValues(int hotelId, int dishId) {
		// TODO Auto-generated method stub

		Hotel hotel = hotelRepo.getOne(hotelId);

		Dish dish = dishRepo.getOne(dishId);

		int s = hotel.getDishlist().size();
		// int a=hotel.getAvgRate();
		// a=1;
		if (s == 0) {
			int rating = dish.getRate();
			hotel.setAvgRate(rating);
			dish.setHotel(hotel);
			dishRepo.save(dish);

		} else {
			int rating = ((hotel.getAvgRate() + dish.getRate()) / (s+1));
			hotel.setAvgRate(rating);
			dish.setHotel(hotel);
			dishRepo.save(dish);
		}

//		int count =0;
//		
//		for(Dish d:hotel.getDishlist())
//		{
//			if(d.getDishId()==dish.getDishId())
//				count++;
//		}
//		if(count!=0)
//		{
//			throw new ControllerException("ALREADY ASSIGNED");
//		}
//		
//		else
//		{
//			
//			hotel.getDishlist().add(dish);
//			dishRepo.save(dish);
//		}
//	}

//	double bal=bank.getRevenue()+user.getBalance();
//	bank.setRevenue(bal);
//	
//	bank.setUser(user);
//	
//	bankRepo.save(bank);
//		
//		
//		
//		
//		Bank bank=bankRepo.getOne(bankId);
//		User user=bankRepo.getOne(userId);
//		int count =0;
//		
//		for(User u:bank.getUserlist())
//		{
//			if(u.getUserId()==user.getUserId()) {
//				count++;
//			}
//					
//			if(count!=0)
//			{
//				th
//			}
//			else
//			{
//				bank.getuserlist.add(user);
//				bankRepo.save(bnk);
//			}
//		}
//		
//		
//	}

//	
//	@Override
//	public void addValues(Dish dish) {
//		// TODO Auto-generated method stub
//		
//		if(dishrepo.existsByName(dish))
//		{
//			
//			throw new ControllerException("BANK ID ALREADY PRESENT");
//		}
//		else
//		{
//		
//		
//	}

	}

	@Override
	public void deleteUser(int dishId) throws ControllerException {
		// TODO Auto-generated method stub
		if (dishRepo.existsById(dishId)) {
			dishRepo.deleteById(dishId);

		} else {
			throw new ControllerException("NO SUCH DISH ID  PRESENT");
		}

	}

	@Override
	public List<Dish> getAllDish() {
		// TODO Auto-generated method stub

		return dishRepo.findAll();

	}
//
//	@Override
//	public void update(int dishId, int rate, int price) {
//		
//		
//		Dish dish =dishRepo.getOne(dishId);
//		
//        if(dish.equals(dishId))
//        {
//        	dish.setName(name);
//        	dish.setPrice(price);
//        	dish.setRate(rate);
//		
//        }
//		
//		if (pakagesss.equals(packageId)) {
//			pakagesss.setPackageName(packageName);
//			pakagesss.setDuration(duration);
//			pakagesss.setSeason(season);
//			pakagesss.setCost(cost);
//			pakagesss.setFood(food);
//			packageRepository.save(pakagesss);
//		}
//	}

	public void update(String name, int rate, int price) throws ControllerException {
		// TODO Auto-generated method stub

		// Dish dish =dishRepo.getOne(dishId);
		Dish dish = dishRepo.findByName(name).get();

		// if(dishRepo.existsByName(name))
		// {
		// Dish dish =dishRepo.getOne(dishId);

		// if(dish.equals(dishId))
		// if(dish.getDishId()==dishId)
		// {

		if (price >= 1) {
			if (rate < 11 && rate >= 1) {
				dish.setName(name);
				dish.setPrice(price);
				dish.setRate(rate);
				dishRepo.save(dish);
			} else {
				throw new ControllerException("INVALID RATING PROVIDED");
			}
		} else {
			throw new ControllerException("INVALID PRICE PROVIDED");
		}

		{

		}

	}

}
