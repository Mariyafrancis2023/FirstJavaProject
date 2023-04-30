package assignmentInInheritance;

public class BankOperations {

	private double balanceAvailable;

	public BankOperations(double balanceAvailable) {
		this.balanceAvailable = balanceAvailable;
	}

	public void withdraw(double withdrawAmount) {
		if (balanceAvailable >= withdrawAmount) {
			balanceAvailable -= withdrawAmount;
		}
	}

	public void deposit(double depositMoney) {
		balanceAvailable += depositMoney;
	}

	public double viewBalance() {
		return balanceAvailable;
	}
}
