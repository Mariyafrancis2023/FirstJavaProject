package inheritanceAssignment;

import java.util.Scanner;

public class PersonAccount {
	private String bankAccountNumber;
	private String name;
	private double fundsAvailable;
	private int pin;
	private String onlineBankingPassword;

	Scanner sc = new Scanner(System.in);

	public PersonAccount(String bankAccountNumber, String name, double fundsAvailable, int pin,
			String onlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.name = name;
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public double getFundsAvailable() {
		return fundsAvailable;
	}

	public void setFundsAvailable(double fundsAvailable) {
		this.fundsAvailable = fundsAvailable;
	}

	public boolean validateAtmPin() {
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
