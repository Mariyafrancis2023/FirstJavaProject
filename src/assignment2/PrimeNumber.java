package assignment2;

import java.util.Scanner;

public class PrimeNumber {

	int number;
	int number1 = 2;
	
	Scanner sc = new Scanner(System.in);
	
	void checkPrimeNumber() {
		
		System.out.println("enter a number");
		number = sc.nextInt();
		
		while(number1 <= number/2) {
			number1++;
			if (number%2 == 0) {
				System.out.println("entered number is not prime number");
				break;
			}else {
				System.out.println("entered number is prime number");
				break;
			}
			
			
		}
			
		

	}
}
