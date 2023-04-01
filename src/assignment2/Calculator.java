package assignment2;

public class Calculator {

	int number1;
	int number2;

	void addition() {
		int sum = number1 + number2;
		System.out.println("sum of " + number1 + " and " + number2 + "are" + sum);
	}

	void substraction() {
		int difference = number1 - number2;
		System.out.println("difference of " + number1 + " and " + number2 + "are" + difference);
	}

	void multiplication() {
		int product = number1 * number2;
		System.out.println("product of " + number1 + " and " + number2 + "are" + product);
	}

	void division() {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("quotiet of " + number1 + " and " + number2 + "are" + quotient);
		System.out.println("reminder of " + number1 + " and " + number2 + "are" + remainder);

	}

	void square() {
		int squareOfNumber = number1 * number1;
		System.out.println("the square of " + number1);
	}

	void cube() {
		int cubeOfNumber = number1 * number1 * number1;
		System.out.println("the cube of " + number1);
	}
}
