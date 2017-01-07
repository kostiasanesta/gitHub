package hometask.com.volkov.task1;

import java.util.Scanner;

public class FirstHomeWork {

	private int first_number;
	private int second_number;
	private Scanner scan;
	private int switch_value;

	public int getSum() {
		return first_number + second_number;
	}

	public int getDif1() {
		return first_number - second_number;
	}

	public int getDif2() {
		return second_number - first_number;
	}

	public int getMulti() {
		return second_number * first_number;
	}

	public float getDiv1() {
		return first_number / second_number;
	}

	public float getDiv2() {
		return second_number / first_number;
	}

	public void makeNumbers() {

		System.out.println("Enter first number");
		this.first_number = toScan(scan);
		System.out.println("Enter second number");
		this.second_number = toScan(scan);

	}


	public int toScan(Scanner scan) {
		return scan.nextInt();

	}

	public int setSwitchValue() {
		System.out.println(
				"enter from 1 to 8:\n 1 - a+b. 2 - a-b. 3 - b-a. 4 - a*b. 5 - a/b. 6 - b/a\n 7-write the numbers again\n 8 - exit");
		this.switch_value = toScan(scan);
		return switch_value;

	}

	public void toSwitch(int switch_value) {
		if (this.switch_value <= 8 && this.switch_value >= 1) {
			switch (this.switch_value) {
			case 1:
				System.out.println("a+b=" + getSum());
				return;
			case 2:
				System.out.println("a-b=" + getDif1());
				return;
			case 3:
				System.out.println("b-a=" + getDif2());
				return;
			case 4:
				System.out.println("a*b=" + getMulti());
				return;
			case 5:
				System.out.println("a/b=" + getDiv1());
				return;
			case 6:
				System.out.println("b/a=" + getDiv2());
				return;
			case 7:
				System.out.println("Enter numbers again:");
				return;

			}

		} else {
			System.out.println("Pls enter from 1 to 8 ");
		}


	}

	public int getSwitch_value() {
		return switch_value;
	}

	public void makeScan(int x) {
		if (x == 1) {
			this.scan = new Scanner(System.in);
		} else {
			this.scan.close();
		}
	}

}
