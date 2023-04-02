package assignment2;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		
		String operation;
		Scanner sc = new Scanner(System.in);
		Calculator calc =  new Calculator();
		System.out.println("enter the operation");
		operation = sc.next();
		
		switch(operation) {
		case "addition":
			calc.addition();
			break;
		case "substarction":
			calc.substraction();
			break;
		case "multiplication":
			calc.multiplication();
			break;
		case "division":
			calc.division();
			break;
		case "square":
			calc.squareOfNumber();
			break;
		case "cube":
			calc.cubeOfNumber();
			break;
			default:
				System.out.println("invalid operation");
		}
	}

}
