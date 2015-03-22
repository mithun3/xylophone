package a.basics;

import java.util.Scanner;

public class InstanceOf {

	public static void main(String[] args) {

		Object operation;
		Object firstNumber;
		Object secondNumber;

		Scanner sc = new Scanner(System.in);
		
		

		System.out.println("Please enter a valid operator (+,-,*,/)");
		while (!sc.hasNext("[\\\\+-/*]")) {
			System.out.println("That's not a valid operator!");
			sc.next();
		}
		String operator = sc.next();
		System.out.println("Got : " + operator);

	}

}
