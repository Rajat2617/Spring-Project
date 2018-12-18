package com.jspiders.spring.vehicle.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.vehicle.bean.VehicleBean;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		VehicleBean vehicleBean = context.getBean(VehicleBean.class);
		vehicleBean.runningVehicle();
	}

}
