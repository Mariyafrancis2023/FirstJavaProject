package abstractionAssignment;

public abstract class BankOperation {

	public double balanceAvailable;

	public abstract void changePinPassword(PersonAccount account);

	public void withdraw(PersonAccount account, double withdrawAmount) {
		if (account.getFundsAvailable() >= withdrawAmount) {
			System.out.println(withdrawAmount + " is withdrawn");
			account.setFundsAvailable(account.getFundsAvailable() - withdrawAmount);
			System.out.println("now the avaliable balance is " + account.getFundsAvailable());
		} else {
			System.out.println("not enough balance");
		}
	}

	public void deposit(PersonAccount account, double depositMoney) {
		balanceAvailable += depositMoney;
	}

	public double viewBalance(PersonAccount account) {
		return balanceAvailable;
	}
}
