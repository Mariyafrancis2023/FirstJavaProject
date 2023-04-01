package assignment2;

import java.util.Scanner;

public class PrimeNumber {

	int number;
	
	Scanner sc = new Scanner(System.in);
	
	void checkPrimeNumber() {
		
		System.out.println("enter a number");
		number = sc.nextInt();
		
		for (int count=1; count<=number; count++) {
			if(number%count == 0) {
				System.out.println("entered number is not a prime number");
				}else {
					System.out.println("entered number is a prime number");
				}
		}
	}
}
