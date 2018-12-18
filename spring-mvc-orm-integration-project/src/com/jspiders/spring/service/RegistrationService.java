package com.jspiders.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.spring.dao.RegistrationDAO;
import com.jspiders.spring.dto.UserDTO;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationDAO registrationDAO;

	public boolean register(UserDTO userDTO) {
		Integer identifier = registrationDAO.saveUser(userDTO);
		if (identifier != null && identifier > 0)
			return true;
		else
			return false;
	}

	public boolean verify(String username, String password) {

		UserDTO userDTO = registrationDAO.verify(username, password);

		if (userDTO == null)
			return false;
		else
			return true;
	}

	public boolean update(Long mobileNumber, String emailID, String caddress, String paddress, String username,
			String password) {

		Integer status = registrationDAO.update(mobileNumber, emailID, caddress, paddress, username, password);

		if (status == null)
			return false;
		else
			return true;
	}

	public boolean updatePassword(String username, String oldpassword, String newpassword) {

		Integer success = registrationDAO.updatePassword(username, oldpassword, newpassword);

		if (success == null)
			return false;
		else
			return true;
	}
}
