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
	 if(enteredPIN == actualPIN) {
		 System.out.println("entered PIN is correct");
	 }
	 System.out.println("Enter the withdraw amount");
		withdrawAmount = sc.nextInt();
	 if (withdrawAmount<=accountBalance) {
		 System.out.println("amount withdraw is" + withdrawAmount);
	 }else {
		 System.out.println("not enough balance");
		 break;
	 }
		if(counter == 3 && actualPIN != enteredPIN){
				System.out.println("Card is blocked as three attempts for PIN is incorrect");
			}else {
				System.out.println("Entered PIN is incorrect");
			}
		}
	
		}

}



