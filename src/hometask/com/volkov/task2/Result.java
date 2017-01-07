package hometask.com.volkov.task2;

public class Result {
	public Result(int first_number, int second_number, int exponent){
		System.out.println(first_number+"*"+second_number+"^"+exponent+"="+Math.multiplyExact(first_number,(long) Math.pow(second_number, exponent)));
		
	}

}
