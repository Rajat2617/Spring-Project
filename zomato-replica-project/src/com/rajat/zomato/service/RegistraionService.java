package com.rajat.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.zomato.dao.RegistrationDAO;
import com.rajat.zomato.dto.CustomerDTO;

@Service
public class RegistraionService {

	@Autowired
	private RegistrationDAO registrationDAO;

	public boolean register(CustomerDTO customerDTO) {
		Integer identifier = registrationDAO.registerCustomer(customerDTO);

		if (identifier == null)
			return false;
		else
			return true;
	}

	public boolean login(String emailID, String password) {
		CustomerDTO loginStatus = registrationDAO.loginCustomer(emailID, password);

		if (loginStatus == null)
			return false;
		else
			return true;
	}

}
