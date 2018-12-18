package com.jspiders.spring.bean;

import java.io.Serializable;

public class SoldierBean implements Serializable {

	private String name;
	private String designation;
	private int noOfKilledEnemies;
	private double height;

	public SoldierBean() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public SoldierBean(String name) {
		this.name = name;
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String disignation) {
		this.designation = disignation;
	}

	public int getNoOfKilledEnemies() {
		return noOfKilledEnemies;
	}

	public void setNoOfKilledEnemies(int noOfKilledEnemies) {
		this.noOfKilledEnemies = noOfKilledEnemies;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void killEnemiesAndProtectNation() {
		System.out.println("Soldier Name : " + this.name);
		System.out.println("Designation : " + this.designation);
		System.out.println("No. of Enemies Killed : : " + this.noOfKilledEnemies);
		System.out.println("Height : " + this.height);

	}
}
