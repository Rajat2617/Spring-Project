package com.jspiders.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.bean.SoldierBean;

public class AppTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		SoldierBean soldierBean = context.getBean(SoldierBean.class);
		soldierBean.killEnemiesAndProtectNation();
	}

}
