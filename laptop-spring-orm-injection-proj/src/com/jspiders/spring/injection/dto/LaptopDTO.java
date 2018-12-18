package com.jspiders.spring.injection.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "laptop_table")
public class LaptopDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "laptop_id")
	private int laptopId;
	@Column(name = "brand")
	private String brand;
	@Column(name = "colour")
	private String colour;
	@Column(name = "price")
	private double price;
	@Column(name = "is_graphics")
	private boolean isGraphics;

	public LaptopDTO() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !");
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsGraphics() {
		return isGraphics;
	}

	public void setIsGraphics(boolean isGraphics) {
		this.isGraphics = isGraphics;
	}

}
