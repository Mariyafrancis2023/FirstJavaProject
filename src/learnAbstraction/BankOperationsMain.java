package learnAbstraction;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {

		BankOperations bank = null;
		PersonAccountDetails person = new PersonAccountDetails("rbc0011", "sony", 1000, "1234", "@1234567");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the banking service: ATM or Online");
		String selectBanking = sc.nextLine();
		switch (selectBanking) {
		case "ATM":
			bank = new ATM(person);
			System.out.println("enter the banking service: withdraw, deposit, viewbalance, change pin");
			String selectServices = sc.nextLine();
			switch (selectServices) {
			case "withdraw":
				System.out.println("enter the amount to be withdrawn");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(withdrawAmount);
				break;
			case "deposit":
				System.out.println("enter the amount to be deposited");
				double depositAmount = sc.nextDouble();
				bank.deposit(depositAmount);
				break;
			case "viewbalance":
				bank.viewBalance();
				break;
			case "change pin":
				bank.changePinPassword();
				break;
			}
			break;

		case "Online":
			bank = new OnlineBanking(person);
			System.out.println("enter the banking service: withdraw, viewbalance, change password");
			String selectService = sc.nextLine();
			switch (selectService) {
			case "withdraw":
				System.out.println("enter the amount to be withdrawn");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(withdrawAmount);
				break;
			case "viewbalance":
				bank.viewBalance();
				break;
			case "change password":
				bank.changePinPassword();
				break;
			}
			break;
		}
	}
}
