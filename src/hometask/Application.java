package hometask;

import java.util.*;

import hometask.com.volkov.task1.FirstHomeWork;
import hometask.com.volkov.task2.SecondHomeTask;
import hometask.com.volkov.task3.ThirdHomeTask;
import hometask.com.volkov.task4.FourthHomeTask;
import hometask.com.volkov.task5.FinalClass;
import hometask.com.volkov.task6.SixthHomeTask;

public class Application {

	private final int RUN = 1;
	private final int CLOSE = 2;
	private final int HOMETASK_1_VALUE = 1;
	private final int HOMETASK_2_VALUE = 2;
	private final int HOMETASK_3_VALUE = 3;
	private final int HOMETASK_4_VALUE = 4;
	private final int HOMETASK_5_VALUE = 5;
	private final int HOMETASK_6_VALUE = 6;

	public static void main(String[] argth) {
		Application app = new Application();
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter 1 to run the first hometask\nEnter 2 to run the second hometask\nEnter 3 to run the third hometask\nEnter 4 to run the fourth hometask\nEnter 5 to run the fifth hometask\nEnter 6 to run the sixth hometask");
		int switch_value = scan.nextInt();
		app.runTheApp(switch_value);
		scan.close();

	}

	private void runTheApp(int switch_value) {
		switch (switch_value) {
		case HOMETASK_1_VALUE:
			// Given 2 integers, such as 3 and 5. Write a program that
			// demonstrates all possible binary operations on these numbers.
			FirstHomeWork task = new FirstHomeWork();
			task.makeScan(RUN);
			task.makeNumbers();
			task.setSwitchValue();
			while (task.getSwitch_value() != 8) {
				if (task.getSwitch_value() != 7) {
					task.toSwitch(task.getSwitch_value());
					task.setSwitchValue();
				}
				if (task.getSwitch_value() == 7) {
					task.toSwitch(task.getSwitch_value());
					task.makeNumbers();
					task.setSwitchValue();
				}

			}

			task.makeScan(CLOSE);
			return;

		case HOMETASK_2_VALUE:
			// 5 Multiply by 2 in the 3rd degree without using opreratsii
			// multiplication. The result is a variable and assign the output to
			// the console.
			SecondHomeTask second_task = new SecondHomeTask();
			second_task.makeScan(RUN);
			second_task.makeNumbers();
			second_task.runThisTask();
			second_task.makeScan(CLOSE);
			return;

		case HOMETASK_3_VALUE:
			// Implement application for administration console sequence of
			// integers is calculated as follows function:
			// finding the arithmetic mean value, maximum value, minimum value,
			// product, sum, difference values.
			ThirdHomeTask third_task = new ThirdHomeTask();
			third_task.makeScan(RUN);
			System.out.println("Enter numbers of elements:");
			third_task.makeNumbers();
			third_task.createMassive();
			third_task.printBeforeScan();
			third_task.makeNumbers();
			while (third_task.getNumber() != 7) {
				if (third_task.getNumber() > 0 && third_task.getNumber() < 7) {
					third_task.runThirdTask();
				} else {
					System.out.println("Please enter from 1 to 7");
				}
				third_task.printBeforeScan();
				third_task.makeNumbers();
			}
			third_task.makeScan(CLOSE);
			return;

		case HOMETASK_4_VALUE:
			// Write a program that performs the following functions:
			//   - Elimination at the console of all even numbers;
			//   - Elimination at the console of all the elements that do not
			// have an even value of the index in the array
			FourthHomeTask fourth_task = new FourthHomeTask();
			fourth_task.makeScan(RUN);
			System.out.println("Enter numbers of elements:");
			fourth_task.makeNumbers();
			fourth_task.createMassive();
			fourth_task.printBeforeScan();
			fourth_task.makeNumbers();
			while (fourth_task.getNumber() != 3) {
				if (fourth_task.getNumber() > 0 && fourth_task.getNumber() <= 2) {
					fourth_task.runTheFourthHometask();
				} else {
					System.out.println("Pls enter from 1 to 3! ");
				}
				fourth_task.printBeforeScan();
				fourth_task.makeNumbers();
			}
			fourth_task.makeScan(CLOSE);
			return;
			
		case HOMETASK_5_VALUE:
			// Write a class (any), which can not be inherited
			FinalClass fifth_task = new FinalClass();
			return;
			
		case HOMETASK_6_VALUE:
			//animals
			SixthHomeTask sixth_task = new SixthHomeTask();
			sixth_task.makeScan(RUN);
			System.out.println("Enter the number of animals");
			sixth_task.makeNumbers();
			sixth_task.createZoo();
			sixth_task.runThisTask();
			sixth_task.makeScan(CLOSE);
			return;

		}

	}
}
