package assignment2;

import java.util.Scanner;

public class PrimeNumber {

	int number;
	
	Scanner sc = new Scanner(System.in);
	
	void checkPrimeNumber() {
		
		System.out.println("enter a number");
		number = sc.nextInt();
		
		for (int count=2; count<=number;) {
			if(number % count == 0) {
				System.out.println("number" + number + " not is prime");
				break;
			}else {
				System.out.println("number" + number + "is prime");
				break;
			}
	
		}

	}
}
