package abstractionAssignment;

import java.util.Scanner;

public class ATM extends BankOperation {

	private PersonAccount[] person = new PersonAccount[5];

	public ATM(PersonAccount[] person) {
		this.person = person;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword() {
		System.out.println("enter the current pin");
		String currentPin = sc.next();
		boolean isPinFound = false;
		for (int i = 0; i < person.length; i++) {
			if (currentPin.equals(person[i].getPin())) {
				System.out.println("enter new pin");
				String newPin = sc.next();
				if (!newPin.equals(currentPin) && newPin.length() == 4) {
					person[i].setPin(newPin);
					System.out.println("pin is updated");
					isPinFound = true;
					break;
				} else {
					System.out.println("updated pin cannot the same as old pin and pin should have 4 numbers");
					isPinFound = true;
					break;
				}
			}
		}
		if (!isPinFound) {
			System.out.println("incorrect pin");
		}
	}

	@Override
	public void withdraw(double withdrawAmount) {
		System.out.println("enter your pin number");
		String enteredPin = sc.next();
		for (int i = 0; i < person.length; i++) {
			if (enteredPin.equals(person[i].getPin())) {
				if (person[i].getFundsAvailable() >= withdrawAmount) {
					super.withdraw(withdrawAmount);
					System.out.println(withdrawAmount + " is withdrawn");
				} else {
					System.out.println("not enough balance");
					break;
				}
			}
		}
	}

	@Override
	public void deposit(double depositMoney) {
		System.out.println("enter your pin number");
		String enteredPin = sc.next();
		for (int i = 0; i < person.length; i++) {
			if (enteredPin.equals(person[i].getPin())) {
				super.deposit(depositMoney);
				System.out.println(depositMoney + " is deposited");
			}
		}
	}

	@Override
	public double viewBalance() {
		System.out.println("enter your pin number");
		String enteredPin = sc.next();
		for (int i = 0; i < person.length; i++) {
			if (enteredPin.equals(person[i].getPin())) {
				balanceAvailable = person[i].getFundsAvailable();
				System.out.println("the available balance is " + balanceAvailable);
			}
		}
		return balanceAvailable;
	}
}
