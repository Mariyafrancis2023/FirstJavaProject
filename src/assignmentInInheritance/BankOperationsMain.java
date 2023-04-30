package assignmentInInheritance;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {

		PersonAccountDetails personDetails = new PersonAccountDetails("a1234", "abc", 1000, 1234, "1234");
		BankOperations operations = new BankOperations(1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the banking service: ATM or Online");
		String selectBanking = sc.nextLine();
		switch (selectBanking) {
		case "ATM":
			boolean isPin = personDetails.validatePin();
			ATMBanking atm = new ATMBanking(1000);
			atm.setPin(isPin);
			System.out.println("enter the banking service: withdraw, deposit, viewBalance");
			String selectService = sc.nextLine();
			switch (selectService) {
			case "withdraw":
				atm.withdraw(500);
				break;
			case "deposit":
				atm.deposit(100);
				break;
			case "viewBalance":
				atm.viewBalance();
				break;
			}
			break;
		case "Online":
			boolean isPassword = personDetails.vaildateOnlineBankingPassword();
			OnlineBanking online = new OnlineBanking(1000);
			online.setPassword(isPassword);
			System.out.println("enter the banking service: withdraw, deposit, viewBalance");
			String selectServices = sc.nextLine();
			switch (selectServices) {
			case "withdraw":
				online.withdraw(500);
				break;
			case "deposit":
				online.deposit(100);
				break;
			case "viewBalance":
				online.viewBalance();
				break;
			}
			break;
		}
	}
}
