package assignmentInInheritance;

public class OnlineBanking extends BankOperations {

	boolean isPassword = false;

	public boolean isPassword() {
		return isPassword;
	}

	public void setPassword(boolean isPassword) {
		this.isPassword = isPassword;
	}

	public OnlineBanking(double balanceAvailable) {
		super(balanceAvailable);
	}

	@Override
	public void withdraw(double withdrawAmount) {
		if (isPassword) {
			super.withdraw(withdrawAmount);
			System.out.println(withdrawAmount + " is withdrawn");
		} else {
			System.out.println("incorrect password");
		}
	}

	@Override
	public void deposit(double depositMoney) {
		if (isPassword) {
			super.deposit(depositMoney);
			System.out.println(depositMoney + " is deposited");
		} else {
			System.out.println("incorrect password");
		}
	}

	@Override
	public double viewBalance() {
		System.out.println(super.viewBalance());
		return super.viewBalance();
	}
}
