package com.jspiders.spring.di.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.di.bean.PenBean;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		PenBean penBean = context.getBean(PenBean.class);
		penBean.write();

	}

}
