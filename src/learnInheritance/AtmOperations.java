package learnInheritance;

public class AtmOperations extends BankingOperation {

	@Override
	public double withdraw(double withdrawAmount) {
		if (balanceAvailable >= withdrawAmount) {
			balanceAvailable -= withdrawAmount;
			System.out.println(withdrawAmount + " is withdrawn");
			System.out.println("the available balance is " + balanceAvailable);
		}
		return balanceAvailable;
	}

	@Override
	public double deposit(double depositMoney) {
		balanceAvailable += depositMoney;
		System.out.println(depositMoney + " is deposited");
		System.out.println("the available balance is " + balanceAvailable);
		return balanceAvailable;
	}

	@Override
	public double viewBalance() {
		System.out.println("the available balance is " + balanceAvailable);
		return balanceAvailable;
	}
}
