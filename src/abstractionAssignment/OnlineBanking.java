package abstractionAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperation {

	Scanner sc = new Scanner(System.in);

	@Override
	public void changePinPassword(PersonAccount account) {
		System.out.println("enter the current password");
		String currentPassword = sc.next();
		if (currentPassword.equals(account.getOnlineBankingPassword())) {
			System.out.println("enter new password");
			String newPassword = sc.next();
			if (newPassword != currentPassword && newPassword.length() >= 8 && !newPassword.contains("&")
					&& !newPassword.contains("$") && !newPassword.contains("@")) {
				account.setOnlineBankingPassword(newPassword);
				System.out.println("password is updated");
			} else {
				System.out.println(
						"passowrd should not be less than 8 characters and have these special characters (&,$, @)");
			}
		} else {
			System.out.println("updated password cannot the same as old password");
		}
	}

	@Override
	public void withdraw(PersonAccount account, double withdrawAmount) {
		System.out.println("enter your password");
		String enteredPassword = sc.next();
		if (enteredPassword.equals(account.getOnlineBankingPassword())) {
			super.withdraw(account, withdrawAmount);
		}
	}

	@Override
	public double viewBalance(PersonAccount account) {
		System.out.println("enter your password");
		String enteredPassword = sc.next();
		if (enteredPassword.equals(account.getOnlineBankingPassword())) {
			balanceAvailable = account.getFundsAvailable();
			System.out.println("the available balance is " + balanceAvailable);
		}
		return balanceAvailable;
	}
}
