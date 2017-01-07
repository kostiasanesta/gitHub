package hometask.com.volkov.task6;

import java.util.Scanner;

import hometask.com.volkov.task6.animals.Bird;
import hometask.com.volkov.task6.animals.Cat;
import hometask.com.volkov.task6.animals.Fish;

public class SixthHomeTask {
	private Scanner scan;
	private Zoo arr;
	private int number;
	private final int CAT_VALUE = 1;
	private final int BIRD_VALUE = 2;
	private final int FISH_VALUE = 3;
	private String name_of_animal;
	private int type;

	public int getType() {
		return type;
	}

	public void setType() {
		this.type = toScan(scan);
	}

	public void makeScan(int x) {
		if (x == 1) {
			this.scan = new Scanner(System.in);
		} else {
			this.scan.close();
		}
	}

	public int toScan(Scanner scan) {
		return scan.nextInt();

	}

	public String toScanString(Scanner scan) {
		return scan.next();
	}

	public void makeNumbers() {

		this.number = toScan(scan);

	}

	public int getNumber() {
		return number;
	}

	public void giveName() {
		this.name_of_animal = toScanString(scan);

	}

	public String getNameOfAnimal() {
		return name_of_animal;
	}

	public void createZoo() {
		arr = new Zoo(getNumber());
		for (int i = 0; i < arr.getArr().length; i++) {
			System.out.println("Enter 1 to create cat;\nEnter 2 to create bird\nEnter 3 to create fish");
			setType();
			// while (arr.testOfCreate(i) == 2) {
			if (getType() > 0 && getType() <= 3) {
				switch (getType()) {
				case CAT_VALUE:
					System.out.println("Write the name of cat:");
					giveName();
					Animal cat = new Cat(getNameOfAnimal());
					arr.setElement(cat);
					arr.setArr(arr.getArr(), i);
					return;
				case BIRD_VALUE:
					System.out.println("Write the name of bird:");
					giveName();
					Animal bird = new Bird(getNameOfAnimal());
					arr.setElement(bird);
					arr.setArr(arr.getArr(), i);
					return;
				case FISH_VALUE:
					System.out.println("Write the name of fish:");
					giveName();
					Animal fish = new Fish(getNameOfAnimal());
					arr.setElement(fish);
					arr.setArr(arr.getArr(), i);
					return;
				}
			} else {
				System.out.println("Enter 1 to 3!");
				setType();
			}
		}
	}

	// }

	public void runThisTask() {
		for (int i = 0; i < arr.getArr().length; i++) {
			System.out.println(arr.getElement().getInfo());

		}
	}
}