package assignmentInInheritance;

public class AtmBanking extends BankOperations {

	boolean isPin = false;

	public boolean isPin() {
		return isPin;
	}

	public void setPin(boolean isPin) {
		this.isPin = isPin;
	}

	public AtmBanking(double balanceAvailable) {
		super(balanceAvailable);
	}

	@Override
	public void withdraw(double withdrawAmount) {
		if (isPin) {
			super.withdraw(withdrawAmount);
			System.out.println(withdrawAmount + " is withdrawn");
		} else {
			System.out.println("incorrect pin");
		}
	}

	@Override
	public void deposit(double depositMoney) {
		if (isPin) {
			super.deposit(depositMoney);
			System.out.println(depositMoney + " is deposited");
		} else {
			System.out.println("incorrect pin");
		}
	}

	@Override
	public double viewBalance() {
		System.out.println(super.viewBalance());
		return super.viewBalance();
	}
}
