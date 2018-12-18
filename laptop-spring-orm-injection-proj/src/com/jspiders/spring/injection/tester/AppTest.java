package com.jspiders.spring.injection.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.injection.dao.LaptopDAO;
import com.jspiders.spring.injection.dto.LaptopDTO;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		LaptopDTO laptopDTO = new LaptopDTO();
		laptopDTO.setBrand("Apple-Mac");
		laptopDTO.setColour("Light-Grey");
		laptopDTO.setIsGraphics(true);
		laptopDTO.setPrice(131500.45);

		LaptopDAO laptopDAO = context.getBean(LaptopDAO.class);
		laptopDAO.saveLaptop(laptopDTO);

	}

}
