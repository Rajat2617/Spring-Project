package com.jspiders.spring.di.bean;

import java.io.Serializable;

public class PenBean implements Serializable {

	private String brand;
	private InkBean inkBean;

	public PenBean() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public InkBean getInkBean() {
		return inkBean;
	}

	public void setInkBean(InkBean inkBean) {
		this.inkBean = inkBean;
	}

	public void write() {
		System.out.println("Wirtting by " + brand + " Pen.");
		inkBean.injectingInk();
	}
}
