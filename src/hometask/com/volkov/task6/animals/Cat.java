package hometask.com.volkov.task6.animals;

import hometask.com.volkov.task6.Animal;

public class Cat extends Animal {
//	private String type = "cat";
//	private String bodyMovement = "cats legs";
//	private String voice = "MIAY MIAY";
//	private String name;
	public Cat(String name) {
		super.name = name;
		super.type = "cat";
		super.bodyMovement = "cats legs";
		super.voice = "MIAY MIAY";

	}
	public String getType() {
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
