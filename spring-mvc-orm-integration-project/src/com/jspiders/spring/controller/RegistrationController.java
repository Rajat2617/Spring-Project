package com.jspiders.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jspiders.spring.dto.UserDTO;
import com.jspiders.spring.service.RegistrationService;

@Controller
public class RegistrationController {

	// @PostMapping("/reg.do")
	// public String registerUser(HttpServletRequest req) {
	// String username = req.getParameter("username");
	// String mobilenum = req.getParameter("mobileNum");
	// Long mobileNum = Long.parseLong(mobilenum);
	//
	// System.out.println(username);
	// System.out.println(mobileNum);
	// return "success.jsp";
	// }

	@Autowired
	private RegistrationService service;

	// @PostMapping("/reg.do")
	// public ModelAndView registerUser(@RequestParam String username, @RequestParam
	// String password,
	// @RequestParam Long mobileNum) {
	//
	// UserDTO userDTO = new UserDTO();
	// userDTO.setUsername(username);
	// userDTO.setPassword(password);
	// userDTO.setMobileNumber(mobileNum);
	//
	// boolean operationStatus = service.register(userDTO);
	// if (operationStatus)
	// return new ModelAndView("success.jsp");
	// // return "success.jsp";
	// else
	// return new ModelAndView("failure.jsp");
	// // return "failure.jsp";
	// }

	@PostMapping("/reg.do")
	public ModelAndView registerUser(@ModelAttribute UserDTO userDTO) {

		boolean operationStatus = service.register(userDTO);
		String status = null;
		if (operationStatus)
			status = "Save Operation was Successful." + userDTO.getUsername();
		else
			status = "Save Operation Failed.";

		return new ModelAndView("success.jsp", "operationStatus", status);
	}

	@PostMapping("/login.do")
	public ModelAndView loginUser(@RequestParam String username, @RequestParam String password) {
		boolean operationStatus = service.verify(username, password);
		String status = null;
		if (operationStatus)
			status = "SuccessFully Login";
		else
			status = "Invalid Username or Password";

		return new ModelAndView("logout.jsp", "operationStatus", status);
	}

	@PostMapping("/update.do")
	public ModelAndView update(@RequestParam Long mobileNumber, @RequestParam String emailID,
			@RequestParam String caddress, @RequestParam String paddress, @RequestParam String username,
			@RequestParam String password) {
		boolean updateStatus = service.update(mobileNumber, emailID, caddress, paddress, username, password);
		String status = null;
		if (updateStatus)
			status = "Profile Updated.";
		else
			status = " Can't be updated due to Invalid Username or Password.";

		return new ModelAndView("updatesuccess.jsp", "updateStatus", status);
	}

	@PostMapping("/updatepassword.do")
	public ModelAndView updatePassword(@RequestParam String username, @RequestParam String oldpassword,
			@RequestParam String newpassword) {
		boolean updateSuccess = service.updatePassword(username, oldpassword, newpassword);
		String status = null;
		if (updateSuccess)
			status = "Password Updated Successfully !";
		else
			status = "Password unsaved, Invalid Username,Password";

		return new ModelAndView("updatesuccess.jsp", "updateSuccess", status);
	}
}
