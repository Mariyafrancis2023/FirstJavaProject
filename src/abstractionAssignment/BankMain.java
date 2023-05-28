package abstractionAssignment;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		BankOperation bank = null;
		PersonAccount sony = new PersonAccount("rbc0011", "sony", 2000, "1234", "12345678");
		PersonAccount bony = new PersonAccount("bmo0121", "bony", 1500, "2345", "@1234567");
		PersonAccount tony = new PersonAccount("td0123", "tony", 1000, "3456", "01234567");
		PersonAccount rony = new PersonAccount("cibc1122", "rony", 3000, "4567", "09876543");
		PersonAccount jony = new PersonAccount("scotia01", "jony", 2500, "5678", "56781234");
		PersonAccount[] person = { sony, bony, tony, rony, jony };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		PersonAccount account = null;
		for (int i = 0; i < person.length; i++) {
			if (name.equals(person[i].getName())) {
				account = person[i];
			}
		}
		System.out.println("enter the banking service: ATM or Online");
		String selectBanking = sc.next();
		switch (selectBanking) {
		case "ATM":
			bank = new ATM();
			System.out.println("enter the banking service: withdraw, deposit, viewbalance, changepin");
			String selectServices = sc.next();
			switch (selectServices) {
			case "withdraw":
				System.out.println("enter the amount to be withdrawn");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(account, withdrawAmount);
				break;
			case "deposit":
				System.out.println("enter the amount to be deposited");
				double depositAmount = sc.nextDouble();
				bank.deposit(account, depositAmount);
				break;
			case "viewbalance":
				bank.viewBalance(account);
				break;
			case "changepin":
				bank.changePinPassword(account);
				break;
			}
			break;

		case "Online":
			bank = new OnlineBanking();
			System.out.println("enter the banking service: withdraw, viewbalance, changepassword");
			String selectService = sc.next();
			switch (selectService) {
			case "withdraw":
				System.out.println("enter the amount to be withdrawn");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(account, withdrawAmount);
				break;
			case "viewbalance":
				bank.viewBalance(account);
				break;
			case "changepassword":
				bank.changePinPassword(account);
				break;
			}
			break;
		}
	}
}
