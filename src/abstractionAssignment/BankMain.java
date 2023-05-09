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
		PersonAccount[] person = {sony, bony, tony, rony, jony};
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
