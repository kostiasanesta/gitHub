package hometask.com.volkov.task6.animals;

import hometask.com.volkov.task6.Animal;

public class Bird extends Animal{
	public Bird(String name) {
		super.name = name;
		super.type = "bird";
		super.bodyMovement = "wings";
		super.voice = "CHIK-CHIRIK";

	}public String getType() {
		return super.type;
	}

	public String getBodyMovement() {
		return super.bodyMovement;
	}

	public String getVoice() {
		return super.voice;
	}

	public String getName() {
		return super.name;
	}

	

	@Override
	public String getInfo() {
		String example = "Hello! My name is " + getName() + " , i am " + getType() + ", i have " + getBodyMovement()
				+ ", and can " + getVoice() + "!";

		return example;

	}
}
