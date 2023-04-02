package assignment2;

import java.util.Scanner;

public class Calculator {

	int number1;
	int number2;
     
	Scanner sc = new Scanner(System.in);
	
	void addition() {
		System.out.println("enter number1");
		number1 = sc.nextInt();
		System.out.println("enter number2");
		number2 = sc.nextInt();
		int sum = number1 + number2;
		System.out.println("sum of numbers is" + sum);
	}
	void substraction() {
		System.out.println("enter number1");
		number1 = sc.nextInt();
		System.out.println("enter number2");
		number2 = sc.nextInt();
		int difference = number1 - number2;
		System.out.println("difference of numbers is" + difference);
	}
	void multiplication() {
		System.out.println("enter number1");
		number1 = sc.nextInt();
		System.out.println("enter number2");
		number2 = sc.nextInt();
		int product = number1 * number2;
		System.out.println("product of numbers is" + product);
	}
	void division() {
		System.out.println("enter number1");
		number1 = sc.nextInt();
		System.out.println("enter number2");
		number2 = sc.nextInt();
		int quotient = number1/number2;
		int remainder = number1%number2;
		System.out.println("quotiet of numbers is" + quotient);
		System.out.println("reminder of numbers is" + remainder);
	}
	void squareOfNumber() {
		System.out.println("enter number1");
	    number1 = sc.nextInt();
		int square = number1 * number1;
		System.out.println("square of numbers is" + square);
	}
	void cubeOfNumber() {
		System.out.println("enter number1");
		number1 = sc.nextInt();
		int cube = number1 * number1 * number1;
		System.out.println("cube of numbers is" + cube);
	}
}
