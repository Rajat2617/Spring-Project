package com.rajat.zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rajat.zomato.dto.CustomerDTO;
import com.rajat.zomato.service.RegistraionService;

@Controller
public class ZomatoController {

	@Autowired
	private RegistraionService service;

	@PostMapping("/create.do")
	public ModelAndView createAccount(CustomerDTO customerDTO) {
		boolean createStatus = service.register(customerDTO);
		String status = null;

		if (createStatus)
			status = "Congratulations ! Welcome To Zomato-Online Foor Order.";
		else
			status = "Opps ! Something issue with Server.";

		return new ModelAndView("success.jsp", "createStatus", status);
	}

	@PostMapping("/login.do")
	public ModelAndView login(@RequestParam String emailID, @RequestParam String password) {
		boolean loginStatus = service.login(emailID, password);
		String status = null;
		if (loginStatus)
			status = "SuccessFully Logged-In. Welcome To Zomato-Online Fooed Order.";
		else
			status = "Invalid Email-Id, Password !";

		return new ModelAndView("loginSuccess.jsp", "loginStatus", status);
	}

}
