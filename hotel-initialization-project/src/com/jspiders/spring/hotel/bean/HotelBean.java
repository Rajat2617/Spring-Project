package com.jspiders.spring.hotel.bean;

import java.io.Serializable;

public class HotelBean implements Serializable {

	private String hotelName;
	private String hotelLocation;
	private double rating;
	private boolean isVeg;
	private int branches;

//	public HotelBean() {
//		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
//	}

	public HotelBean(String hName, String hLocation, double rating, boolean isVeg, int branches) {
		this.hotelName = hName;
		this.hotelLocation = hLocation;
		this.rating = rating;
		this.isVeg = isVeg;
		this.branches = branches;
		System.out.println(this.getClass().getSimpleName() + " Parameterised Object Created !!");
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setIsVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public int getBranches() {
		return branches;
	}

	public void setBranches(int branches) {
		this.branches = branches;
	}

	public void eating() {
		System.out.println("Hotel Name : " + this.hotelName);
		System.out.println("Location : " + this.hotelLocation);
		System.out.println("Rating : " + this.rating);
		System.out.println("Veg. Availability : " + this.isVeg);
		System.out.println("Branches : " + this.branches);
	}

}
