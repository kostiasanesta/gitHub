package hometask;

import java.util.Scanner;

import hometask.com.volkov.task1.FirstHomeWork;

public class Application {
	public final int RUN = 1;
	public final int CLOSE = 2;
	public final int HOMETASK_1_VALUE = 1;

	public static void main(String[] argth) {
		Application app = new Application();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 to run first hometask");
		int switch_value = scan.nextInt();
		app.runTheApp(switch_value);
		scan.close();

	}

	private void runTheApp(int switch_value) {
		switch (switch_value) {
		case HOMETASK_1_VALUE:
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
			

		}
	}
}
