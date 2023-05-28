package learnInheritance;

import java.util.Scanner;

public class PersonDetails {
	private String bankAccountNumber;
	private String name;
	private double fundsAvailable;
	private int pin;
	private String onlineBankingPassword;

	Scanner sc = new Scanner(System.in);

	public PersonDetails(String bankAccountNumber, String name, double fundsAvailable, int pin,
			String onlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.name = name;
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public String getAccountHolderName() {
		return name;
	}

	public double getAvailableFunds() {
		return fundsAvailable;
	}

	public int getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
}
