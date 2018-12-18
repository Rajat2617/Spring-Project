package com.jspiders.spring.hotel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.hotel.bean.HotelBean;

public class AppTest {

	public static void main(String[] args) {

		String configFile = "context.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);


		HotelBean hotelBean = context.getBean(HotelBean.class);
		hotelBean.eating();
		
		// HotelBean hotelBean1 = context.getBean("hotelBean" , HotelBean.class);
		// hotelBean1.eating();


	}

}
