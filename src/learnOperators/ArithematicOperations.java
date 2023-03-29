package learnOperators;

public class ArithematicOperations {
	int num1;
	int num2;

	void addition() {
		int sum = num1 + num2;
		System.out.println("sum of " + num1 + " and " + num2 + "are" + sum);
	}

	void substraction() {
int difference = num1 - num2;
System.out.println("difference of "+ num1 +" and "+ num2 +"are" + difference);
	}
	
	void multiplication() {
		int product = num1 * num2;
		System.out.println("product of "+ num1 +" and "+ num2 +"are" + product);
	}
	
	void division() {
		int quotient = num1/num2;
		int remainder = num1%num2;
		System.out.println("quotiet of "+ num1 +" and "+ num2 +"are" + quotient);
		System.out.println("reminder of "+ num1 +" and "+ num2 +"are" + remainder);
		
	}
}
