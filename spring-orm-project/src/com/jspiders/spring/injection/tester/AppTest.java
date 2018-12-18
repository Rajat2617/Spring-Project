package com.jspiders.spring.injection.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.injection.dao.PayTmDAO;
import com.jspiders.spring.injection.dto.PayTmDTO;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		PayTmDTO payTmDTO = new PayTmDTO();
		payTmDTO.setUserName("Rajiv Ranjan");
		payTmDTO.setWalletBalance(200.69);
		payTmDTO.setNoOfTransactions(20);

		PayTmDAO payTmDAO = context.getBean(PayTmDAO.class);
		payTmDAO.savePayTm(payTmDTO);

	}

}
