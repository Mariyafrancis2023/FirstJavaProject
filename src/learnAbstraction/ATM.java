package learnAbstraction;

import java.util.Scanner;

public class ATM extends BankOperations {

	private PersonAccountDetails person;

	Scanner sc = new Scanner(System.in);

	public ATM(PersonAccountDetails person) {
		this.person = person;
	}

	@Override
	public void changePinPassword() {
		System.out.println("enter the current pin");
		String currentPin = sc.next();
		if (currentPin.equals(person.getPin())) {
			System.out.println("enter new pin");
			String newPin = sc.next();
			if (newPin != currentPin && newPin.length() == 4) {
				person.setPin(newPin);
				System.out.println("pin is updated");
			} else {
				System.out.println("try again, pin should have 4 numbers");
			}
		} else {
			System.out.println("updated pin cannot the same as old pin");
		}
	}

	@Override
	public void withdraw(double withdrawAmount) {
		if (person.getFundsAvailable() >= withdrawAmount) {
			super.withdraw(withdrawAmount);
			System.out.println(withdrawAmount + " is withdrawn");
		} else {
			System.out.println("not enough balance");
		}
	}

	@Override
	public void deposit(double depositMoney) {
		super.deposit(depositMoney);
		System.out.println(depositMoney + " is deposited");
	}

	@Override
	public double viewBalance() {
		System.out.println(person.getFundsAvailable() + " is available in account");
		return person.getFundsAvailable();
	}
}
