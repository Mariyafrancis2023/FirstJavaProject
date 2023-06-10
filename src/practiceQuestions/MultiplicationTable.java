package practiceQuestions;

import java.util.Scanner;

public class MultiplicationTable {

	Scanner sc = new Scanner(System.in);

	public void printMultiplicationTable() {
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println("multiplication table for " + number + " is");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + number + " = " + number * i);
		}
	}

	public void printSumOfNaturalNumbers() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("sum of natural numbers is " + sum);
	}

	public void printPositiveOrNegative() {
		System.out.println("enter number");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println("enter number is positive number");
		} else {
			System.out.println("enter number is negative number");
		}
	}

	public void checkPrime() {
		System.out.println("enter number");
		int number = sc.nextInt();
		if (number <= 1) {
			System.out.println("number is not prime");
		}
		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				System.out.println("number is not prime");
				break;
			} else {
				System.out.println("number is prime");
				break;
			}
		}
	}

	public void checkPalindrome() {
		System.out.println("enter number");
		int enteredNumber = sc.nextInt();
		int remainder = 0;
		int revereNumber = 0;
		int number;
		number = enteredNumber;
		while (enteredNumber > 0) {
			remainder = enteredNumber % 10;
			revereNumber = (revereNumber * 10) + remainder;
			enteredNumber = enteredNumber / 10;
		}
		if (number == revereNumber) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
	}

	public void printPrimeBetweenIntervals() {
		System.out.println("enter low bound number");
		int lowNumber = sc.nextInt();
		System.out.println("enter high bound number");
		int highNumber = sc.nextInt();

		while (lowNumber <= highNumber) {
			boolean isPrime = true;
			for (int i = 2; i <= lowNumber / 2; i++) {
				if (lowNumber % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(lowNumber);
			}
			lowNumber++;
		}
	}
}
