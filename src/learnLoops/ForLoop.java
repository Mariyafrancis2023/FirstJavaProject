package learnLoops;

import java.util.Scanner;

public class ForLoop {
	
	int actualPIN = 1234;
	int enteredPIN;
	int withdrawAmount;
	int accountBalance = 1000;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {
		for (
				int counter = 1; 
				counter <= 3; 
				counter++) {
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();
			System.out.println("Enter the withdraw amount");
			withdrawAmount = sc.nextInt();
			if (actualPIN == enteredPIN && withdrawAmount<=accountBalance) {
				System.out.println("Entered PIN is correct");
				System.out.println("Cash withdrawn amount is: "+withdrawAmount);
				break;
			}
		else if(counter == 3 && actualPIN != enteredPIN){
				System.out.println("Card is blocked as three attempts for PIN is incorrect");
			}else {
				System.out.println("Entered PIN is incorrect");
			}
		}
	}

}


