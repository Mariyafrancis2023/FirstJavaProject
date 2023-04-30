package assignmentInInheritance;

import java.util.Scanner;

public class PersonAccountDetails {

	private String bankAccountNumber;
	private String name;
	private double fundsAvailable;
	private int pin;
	private String onlineBankingPassword;

	Scanner sc = new Scanner(System.in);

	public PersonAccountDetails(String bankAccountNumber, String name, double fundsAvailable, int pin,
			String onlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.name = name;
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public boolean validatePin() {
		boolean isPinCorrect = false;
		System.out.println("enter the ATM pin");
		int enteredPin = sc.nextInt();
		if (enteredPin == pin) {
			isPinCorrect = true;
		}
		return isPinCorrect;
	}

	public boolean vaildateOnlineBankingPassword() {
		boolean isPasswordCorrect = false;
		System.out.println("enter the online password");
		String enteredPassword = sc.next();
		if (enteredPassword.equals(onlineBankingPassword)) {
			isPasswordCorrect = true;
		}
		return isPasswordCorrect;
	}
}
