package hometask.com.volkov.task3;

import java.util.Scanner;

public class ThirdHomeTask {
	private int number;
	private Scanner scan;
	private final int AVARAGE_VALUE = 1;
	private final int MAX_VALUE = 2;
	private final int MIN_VALUE = 3;
	private final int MULTIPLY_VALUE = 4;
	private final int SUM_VALUE = 5;
	private final int DIFFERENCE_VALUE = 6;
	private Massive arr;

	public void makeNumbers() {

		this.number = toScan(scan);

	}

	public int getNumber() {
		return number;
	}

	public int toScan(Scanner scan) {
		return scan.nextInt();

	}

	public void makeScan(int x) {
		if (x == 1) {
			this.scan = new Scanner(System.in);
		} else {
			this.scan.close();
		}
	}

	public void printBeforeScan() {
		System.out.println(
				"Enter numbers (1 to 7):\n1 - to see avarage; 2 - to see max value;\n3 - to see min value; 4 - to see multiply value;\n5- to see sum value; 6 - to see difference value;\n7 - to exit;");
	}

	public void runThirdTask() {
		switch (getNumber()) {
		case AVARAGE_VALUE:
			System.out.println("avarage arithmetic mean is " + avarage(arr.getArr()));
			return;
		case MAX_VALUE:
			System.out.println("max value is " + max(arr.getArr()));
			return;
		case MIN_VALUE:
			System.out.println("min value is " + min(arr.getArr()));
			return;
		case MULTIPLY_VALUE:
			System.out.println("multiply value is " + multiply(arr.getArr()));
			return;
		case SUM_VALUE:
			System.out.println("sum value is " + sum(arr.getArr()));
			return;
		case DIFFERENCE_VALUE:
			System.out.println("difference value is " + difference(arr.getArr()));
			return;
		}

	}

	public void createMassive() {
		arr = new Massive(this.number);
		int i = getNumber();
		for (int j = 0; j < i; j++) {
			System.out.println("Enter element value:");
			makeNumbers();
			arr.setElement(getNumber());
			arr.setArr(arr.getArr(), j);

		}

	}

	public float avarage(int[] arr) {
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum /= arr.length;
	}

	public int max(int[] arr) {
		int maxCount = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxCount) {
				maxCount = arr[i];
			}
		}
		return maxCount;
	}

	public int min(int[] arr) {
		int minCount = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minCount) {
				minCount = arr[i];
			}
		}
		return minCount;
	}

	public long multiply(int[] arr) {
		long multiCount = 1;
		for (int i = 0; i < arr.length; i++) {
			multiCount *= arr[i];
		}
		return multiCount;
	}

	public long sum(int[] arr) {
		long sumCount = 0;
		for (int i = 0; i < arr.length; i++) {
			sumCount += arr[i];
		}
		return sumCount;
	}

	public long difference(int[] arr) {
		long difCount = arr[0];
		for (int i = 1; i < arr.length; i++) {
			difCount -= arr[i];
		}
		return difCount;
	}

}
