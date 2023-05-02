package inheritanceAssignment;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {
		PersonAccount person = new PersonAccount("a1234", "maria", 1000, 1234, "1234");
		BankOperations bank = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the banking service: ATM or Online");
		String selectBanking = sc.nextLine();
		switch (selectBanking) {
		case "ATM":
			bank = new ATM();
			boolean isPin = person.validateAtmPin();
			if (isPin) {
				System.out.println("enter the banking service: withdraw, deposit, viewbalance");
				String selectServices = sc.nextLine();
				switch (selectServices) {
				case "withdraw":
					System.out.println("enter the amount to be withdrawn");
					double withdrawAmount = sc.nextDouble();
					bank.withdraw(withdrawAmount);
					break;
				case "deposit":
					System.out.println("enter the amount to be withdrawn");
					double depositAmount = sc.nextDouble();
					bank.deposit(depositAmount);
					break;
				case "viewbalance":
					bank.viewBalance(person.getFundsAvailable());
					break;
				}
			} else {
				System.out.println("incorrect pin");
			}
			break;
		case "Online":
			bank = new OnlineBanking();
			boolean isPassword = person.vaildateOnlineBankingPassword();
			if (isPassword) {
				System.out.println("enter the banking service: withdraw, deposit, viewbalance");
				String selectServices = sc.nextLine();
				switch (selectServices) {
				case "withdraw":
					System.out.println("enter the amount to be withdrawn");
					double withdrawAmount = sc.nextDouble();
					bank.withdraw(withdrawAmount);
					break;
				case "deposit":
					System.out.println("enter the amount to be withdrawn");
					double depositAmount = sc.nextDouble();
					bank.deposit(depositAmount);
					break;
				case "viewbalance":
					bank.viewBalance(person.getFundsAvailable());
					break;
				}
			} else {
				System.out.println("incorrect password");
			}
			break;
		}
	}

}
