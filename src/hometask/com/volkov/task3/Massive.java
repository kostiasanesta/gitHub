package hometask.com.volkov.task3;

public class Massive {
	private int[] arr;
	private int element;

	public Massive(int amount) {
		arr = new int[amount];

	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr, int number_of_element) {
		arr[number_of_element]=getElement();
		this.arr = arr;
	}

}
