package practiceQuestions;

import java.util.Scanner;

public class SmallestAndLargestNumber {

	int[] numbers = { 52, 33, 45, 22, 17, 75, 3 };
	int largestNumber = numbers[0];
	int smallestNumber = numbers[0];

	Scanner sc = new Scanner(System.in);

	public void findLargestNumber() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestNumber) {
				largestNumber = numbers[i];
			}
		}
		System.out.println("largest number is: " + largestNumber);
	}

	public void findSmallestNumber() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		System.out.println("largest number is: " + smallestNumber);
	}

	public void findFactorial() {
		System.out.println("enter the number");
		int number = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of " + number + " is: " + factorial);
	}

	public void printFibonacciSeries() {
		int startNumber = 0;
		int number = 1;
		int sum = 0;
		System.out.println(startNumber);
		System.out.println(number);
		for (int i = 1; i < 10; i++) {
			sum = startNumber + number;
			System.out.println(sum);
			startNumber = number;
			number = sum;
		}
	}

	public void printFactors() {
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println("the factors of " + number + " is: ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void printPowerOfNumber() {
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println("enter the power");
		int power = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = number * result;
		}
		System.out.println("power of " + number + " is: " + result);
	}
}
