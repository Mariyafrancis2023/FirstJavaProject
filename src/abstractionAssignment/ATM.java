package abstractionAssignment;

import java.util.Scanner;

public class ATM extends BankOperation {

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(PersonAccount account) {
		System.out.println("enter the current pin");
		String currentPin = sc.next();
		if (currentPin.equals(account.getPin())) {
			System.out.println("enter new pin");
			String newPin = sc.next();
			if (newPin != currentPin && newPin.length() == 4) {
				account.setPin(newPin);
				System.out.println("pin is updated");
			} else {
				System.out.println("pin should have 4 digits");
			}
		} else {
			System.out.println("updated pin cannot the same as old pin");
		}
	}

	@Override
	public void withdraw(PersonAccount account, double withdrawAmount) {
		System.out.println("enter your pin number");
		String enteredPin = sc.next();
		if (enteredPin.equals(account.getPin())) {
			super.withdraw(account, withdrawAmount);
		}
	}

	@Override
	public void deposit(PersonAccount account, double depositMoney) {
		System.out.println("enter your pin number");
		String enteredPin = sc.next();
		if (enteredPin.equals(account.getPin())) {
			super.deposit(account, depositMoney);
			System.out.println(depositMoney + " is deposited");
			account.setFundsAvailable(account.getFundsAvailable() + depositMoney);
			System.out.println("now the avaliable balance is " + account.getFundsAvailable());
		}
	}

	@Override
	public double viewBalance(PersonAccount account) {
		System.out.println("enter your pin number");
		String enteredPin = sc.next();
		if (enteredPin.equals(account.getPin())) {
			balanceAvailable = account.getFundsAvailable();
			System.out.println("the available balance is " + balanceAvailable);
		}
		return balanceAvailable;
	}
}
