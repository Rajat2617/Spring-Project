package com.jspiders.spring.tubelight.bean;

import java.io.Serializable;

public class TubeLightBean implements Serializable {

	private String brand;
	private String colour;
	private String type;
	private double price;

	public TubeLightBean() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void giveLight() {
		System.out.println("Brand : " + this.brand);
		System.out.println("Colour : " + this.colour);
		System.out.println("Type : " + this.type);
		System.out.println("Price : " + this.price);
	}

}
