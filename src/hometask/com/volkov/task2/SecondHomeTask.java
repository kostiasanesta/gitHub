package hometask.com.volkov.task2;

import java.util.Scanner;

public class SecondHomeTask {
	private Scanner scan;
	private int second_number;
	private int first_number;
	private int exponent;

	public void runThisTask() {

		Result res = new Result(first_number, second_number, exponent);

	}

	public void makeNumbers() {

		System.out.println("Enter first number");
		this.first_number = toScan(scan);
		System.out.println("Enter second number");
		this.second_number = toScan(scan);
		System.out.println("Enter exponent");
		this.exponent = toScan(scan);

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

}
