package inheritanceAssignment;

public class ATM extends BankOperations {
	
	@Override
	public void withdraw(double withdrawAmount) {
		super.withdraw(withdrawAmount);
		System.out.println(withdrawAmount + " is withdrawn");
	}

	@Override
	public void deposit(double depositMoney) {
		super.deposit(depositMoney);
		System.out.println(depositMoney + " is deposited");
	}

	@Override
	public double viewBalance(double fundsAvailable) {
		System.out.println(fundsAvailable + " is available in account");
		return fundsAvailable;
	}
}