package learnAbstraction;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	private PersonAccountDetails person;

	Scanner sc = new Scanner(System.in);

	public OnlineBanking(PersonAccountDetails person) {
		this.person = person;
	}

	@Override
	public void changePinPassword() {
		System.out.println("enter the current password");
		String currentPassword = sc.next();
		if (currentPassword.equals(person.getOnlineBankingPassword())) {
			System.out.println("enter new password");
			String newPassword = sc.next();
			if (newPassword != currentPassword && newPassword.length() >= 8 && !newPassword.contains("&")
					&& !newPassword.contains("$") && !newPassword.contains("@")) {
				person.setOnlineBankingPassword(newPassword);
				System.out.println("password is updated");
			} else {
				System.out.println("try again, passowrd should not be less than 8 characters and have these special characters (&,$, @)");
			}
		} else {
			System.out.println("updated password cannot the same as old password");
		}
	}

	@Override
	public void withdraw(double withdrawAmount) {
		super.withdraw(withdrawAmount);
		System.out.println(withdrawAmount + " is withdrawn");
	}

	@Override
	public double viewBalance() {
		System.out.println(person.getFundsAvailable() + " is available in account");
		return person.getFundsAvailable();
	}
}
