package hometask.com.volkov.task4;

import java.util.Scanner;

import hometask.com.volkov.task3.Massive;

public class FourthHomeTask {
	private int number;
	private Scanner scan;
	private Massive arr;
	private final int EVEN_VALUE = 1;
	private final int DO_NOT_EVEN_VALUE = 2;

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

	public void makeNumbers() {

		this.number = toScan(scan);

	}

	public int getNumber() {
		return number;
	}

	public void runTheFourthHometask() {
		switch (getNumber()) {
		case EVEN_VALUE:
			printMassive(arr.getArr());
			printEven(arr.getArr());
			return;
		case DO_NOT_EVEN_VALUE:
			printMassive(arr.getArr());
			printDoNotEven(arr.getArr());
			return;

		}

	}

	public void printMassive(int[] arr) {
		System.out.println("Our massive:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.print("\n");
	}

	public void printEven(int[] arr) {
		System.out.println("Elements of massive with even indexes:");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

	public void printDoNotEven(int[] arr) {
		System.out.println("Elements of massive with do not even indexes:");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public void printBeforeScan() {
		System.out.println(
				"\nEnter number (1 to 3):\n1 - to see elements with even indexes; 2 - to see elements with do not even indexes;\n3 - to exit");

	}
}
