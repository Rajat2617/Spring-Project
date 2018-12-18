package com.jspiders.spring.vehicle.bean;

import java.io.Serializable;

public class VehicleBean implements Serializable {

	private String model;
	private String regNumber;
	private double price;
	private double average;

//	public VehicleBean() {
//		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
//	}

	public VehicleBean(String model, String regNumber, double price, double average) {
		this.model = model;
		this.regNumber = regNumber;
		this.price = price;
		this.average = average;
		System.out.println(this.getClass().getSimpleName() + " Parameterized Object Created !!");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public void runningVehicle() {
		System.out.println("-----------------------------------");
		System.out.println("Model : " + this.model);
		System.out.println("Reg. Number : " + this.regNumber);
		System.out.println("Average : " + this.average);
		System.out.println("Price : " + this.price);
	}

}
