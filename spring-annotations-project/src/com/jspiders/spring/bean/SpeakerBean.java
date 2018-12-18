package com.jspiders.spring.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpeakerBean implements Serializable {

	@Value("75")
	private int volume;

	public SpeakerBean() {
		System.out.println(this.getClass().getSimpleName() + " Object Created !");
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void provideSound() {
		System.out.println("Providing sound " + this.volume);
	}

}
