package learnInheritance;

import java.util.Scanner;

public class BankingOperationMain {

	public static void main(String[] args) {
		
		BankingOperation bank = null;
		PersonDetails person = new PersonDetails("a1234","name",1000,1234,"1234");
		Scanner sc = new Scanner(System.in);
		System.out.println("select the banking option : ATM or Online Banking");
		String bankingOption = sc.next();
		switch(bankingOption) {
		case "ATM":
			System.out.println("enter the pin");
			int enteredPin = sc.nextInt();
			bank = new AtmOperations();
			if(person.getPin()==enteredPin) {
				System.out.println("account holder name: " + person.getAccountHolderName());
				System.out.println("account number: " + person.getBankAccountNumber());
				System.out.println("select the banking service : deposit, withdraw, view balance");
				String bankingService = sc.next();
				switch(bankingService) {
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
				}
				break;

			}
		}


	}

}
