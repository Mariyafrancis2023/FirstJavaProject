package assignmentInInheritance;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {

		PersonAccountDetails personDetails = new PersonAccountDetails("a1234", "abc", 1000, 1234, "1234");
//		BankOperations operations = new BankOperations(1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the banking service: ATM or Online");
		String selectBanking = sc.nextLine();
		switch (selectBanking) {
		case "ATM":
			boolean isPin = personDetails.validatePin();
			AtmBanking atm = new AtmBanking(1000);
			atm.setPin(isPin);
			System.out.println("enter the banking service: withdraw, deposit, viewbalance");
			String selectService = sc.nextLine();
			switch (selectService) {
			case "withdraw":
				atm.withdraw(500);
				break;
			case "deposit":
				atm.deposit(100);
				break;
			case "viewbalance":
				atm.viewBalance();
				break;
			}
			break;
		case "Online":
			boolean isPassword = personDetails.vaildateOnlineBankingPassword();
			OnlineBanking online = new OnlineBanking(1000);
			online.setPassword(isPassword);
			System.out.println("enter the banking service: withdraw, deposit, viewbalance");
			String selectServices = sc.nextLine();
			switch (selectServices) {
			case "withdraw":
				online.withdraw(500);
				break;
			case "deposit":
				online.deposit(100);
				break;
			case "viewbalance":
				online.viewBalance();
				break;
			}
			break;
		}
	}   
	
/*	PersonAccountDetails personDetails = new PersonAccountDetails("a1234", "abc", 1000, 1234, "1234");
	BankOperations operations = null;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the banking service: ATM or Online");
	String selectBanking = sc.nextLine();
	switch (selectBanking) {
	case "ATM":
		boolean isPin = personDetails.validatePin();
		operations = new ATMBanking(1000);
		operations.setPin(isPin);
		System.out.println("enter the banking service: withdraw, deposit, viewBalance");
		String selectService = sc.nextLine();
		switch (selectService) {
		case "withdraw":
			operations.withdraw(500);
			break;
		case "deposit":
			operations.deposit(100);
			break;
		case "viewBalance":
			operations.viewBalance();
			break;
		}
		break;
	case "Online":
		boolean isPassword = personDetails.vaildateOnlineBankingPassword();
		operations = new OnlineBanking(1000);
		operations.setPassword(isPassword);
		System.out.println("enter the banking service: withdraw, deposit, viewBalance");
		String selectServices = sc.nextLine();
		switch (selectServices) {
		case "withdraw":
			operations.withdraw(500);
			break;
		case "deposit":
			operations.deposit(100);
			break;
		case "viewBalance":
			operations.viewBalance();
			break;
		}
		break;
	}
}  */
}
