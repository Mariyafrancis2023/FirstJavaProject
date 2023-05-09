package abstractionAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {

	private PersonAccount[] person = new PersonAccount[5];

	public OnlineBanking(PersonAccount[] person) {
		this.person = person;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword() {
		System.out.println("enter the current password");
		String currentPassword = sc.next();
		boolean isPasswordFound = false;
		for (int i = 0; i < person.length; i++) {
			if (currentPassword.equals(person[i].getOnlineBankingPassword())) {
				System.out.println("enter new password");
				String newPassword = sc.next();
				if (newPassword != currentPassword && newPassword.length() >= 8 && !newPassword.contains("&")
						&& !newPassword.contains("$") && !newPassword.contains("@")) {
					person[i].setOnlineBankingPassword(newPassword);
					System.out.println("password is updated");
					isPasswordFound = true;
					break;
				} else {
					System.out.println(
							"passowrd should not be less than 8 characters and have these special characters (&,$, @)");
					isPasswordFound = true;
					break;
				}
			}
		}
		if (!isPasswordFound) {
			System.out.println("incorrect password");
		}
	}

	@Override
	public void withdraw(double withdrawAmount) {
		System.out.println("enter your password");
		String enteredPassword = sc.next();
		for (int i = 0; i < person.length; i++) {
			if (enteredPassword.equals(person[i].getOnlineBankingPassword())) {
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
	public double viewBalance() {
		System.out.println("enter your password");
		String enteredPassword = sc.next();
		for (int i = 0; i < person.length; i++) {
			if (enteredPassword.equals(person[i].getOnlineBankingPassword())) {
				balanceAvailable = person[i].getFundsAvailable();
				System.out.println("the available balance is " + balanceAvailable);
			}
		}
		return balanceAvailable;
	}
}
