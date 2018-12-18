package com.jspiders.spring.di.bean;

import java.io.Serializable;

public class InkBean implements Serializable {

	private String colour;

	public InkBean() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !!");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void injectingInk() {
		System.out.println("Pen has " + colour + " Ink.");
	}

}
