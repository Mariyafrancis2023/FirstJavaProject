package learnAbstraction;

public abstract class BankOperations {
	
	public double balanceAvailable;
	
	public abstract void changePinPassword(); 
	
	public void withdraw(double withdrawAmount) {
			balanceAvailable -= withdrawAmount;			
	}

	public void deposit(double depositMoney) {
		balanceAvailable += depositMoney;
	}

	public double viewBalance() {
		return balanceAvailable;	
	}
}
