package com.jspiders.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class RechargeController {

	@GetMapping("/rechargeMobile.do")
	public String rechargeMobile() {
		System.out.println("Inside rechargeMobile() of RechargeController");
		return "success.jsp";
	}

	@GetMapping("/rechargeDTH.do")
	public String rechargeDTH() {
		System.out.println("Inside rechargeDTH() of RechargeController");
		return "success.jsp";
	}
}
