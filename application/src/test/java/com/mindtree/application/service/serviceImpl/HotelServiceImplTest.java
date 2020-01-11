package com.mindtree.application.service.serviceImpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mindtree.application.entity.Hotel;
import com.mindtree.application.repositary.HotelRepo;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(HotelServiceImpl.class)
public class HotelServiceImplTest {

	@InjectMocks
	private HotelServiceImpl hotelServiceImpl;
	
	@Mock
	private HotelRepo hotelRepo;
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(hotelServiceImpl).build();
		
	}

		
	}

	


