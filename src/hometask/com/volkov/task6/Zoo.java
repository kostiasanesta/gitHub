package hometask.com.volkov.task6;

import hometask.com.volkov.task6.animals.Bird;
import hometask.com.volkov.task6.animals.Cat;
import hometask.com.volkov.task6.animals.Fish;

public class Zoo {
	private Animal[] arr;
	private Animal animal_type;

	public Zoo(int number) {
		arr = new Animal[number];

	}

	public Animal getElement() {
		return animal_type;
	}

	public void setElement(Animal i) {
		this.animal_type = i;
	}

	public Animal[] getArr() {
		return arr;
	}

	public void setArr(Animal[] arr, int number_of_element) {
		arr[number_of_element] = getElement();
		this.arr = arr;
	}

	public int testOfCreate(int x) {
		if (arr[x] instanceof Cat || arr[x] instanceof Bird || arr[x] instanceof Fish) {
			return 1;
		} else {
			return 2;
		}
	}

}
