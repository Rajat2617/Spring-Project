package com.jspiders.spring.tubelight.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.tubelight.bean.TubeLightBean;

public class AppTest {

	public static void main(String[] args) {
		String configFile = "context.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		TubeLightBean tubeLightBean = context.getBean(TubeLightBean.class);

		tubeLightBean.giveLight();
	}

}
