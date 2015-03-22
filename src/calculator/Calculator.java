package calculator;

import java.util.*;

public class Calculator{

	public static void main(String args[]){
	
		String operation;
		int firstNumber;
		int secondNumber;
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Welcome to calculator");
		
		System.out.println("Please input the First number : ");
		firstNumber = scanner.nextInt();
		
		System.out.println("Please input the Second number : ");
		secondNumber = scanner.nextInt();
		
		System.out.println("Please input the Type of Operation (+, -, * or /) : ");
		operation = scanner.next();
		
		System.out.println("your inputs are : " + firstNumber + "  " + operation + "  " + secondNumber);
		
		if(operation.equals("+")){
		
			System.out.println("Adding two numbers");
			Add a = new Add();
			int addedValue = a.add(firstNumber,secondNumber);
			System.out.println("your inputs are : " + firstNumber + "  " + operation + "  " + secondNumber + " = " +addedValue);
		
		}
		
		
	
	}

}