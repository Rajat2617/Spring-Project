package com.jspiders.spring.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("singleton")
public class MicrophoneBean implements Serializable {

	@Value("Sony")
	private String brand;
	private double price;
	// @Autowired
	private SpeakerBean speakerBean;

	// public MicrophoneBean() {
	// System.out.println(this.getClass().getSimpleName() + " Object Created !");
	// }

	// public MicrophoneBean(@Value("Bose") String brand, @Value("400.98") double
	// price) {
	// this.brand = brand;
	// this.price = price;
	// System.out.println(this.getClass().getSimpleName() + " Parametrised Object
	// Created !");
	// }

	@Autowired
	public MicrophoneBean(SpeakerBean speakerBean) {
		super();
		this.speakerBean = speakerBean;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	@Value(value = "300.45")
	public void setPrice(double price) {
		this.price = price;
	}

	public SpeakerBean getSpeakerBean() {
		return speakerBean;
	}

	// @Autowired
	public void setSpeakerBean(SpeakerBean speakerBean) {
		this.speakerBean = speakerBean;
	}

	public void listenVoice() {
		System.out.println("Listening to the Voice " + this.brand + " of price : " + this.price + " !!");
		speakerBean.provideSound();
	}
}
