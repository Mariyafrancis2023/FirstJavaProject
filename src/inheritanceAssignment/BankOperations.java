package inheritanceAssignment;

public class BankOperations {

		public double balanceAvailable;
		
		public void withdraw(double withdrawAmount) {
			if (balanceAvailable >= withdrawAmount) {
				balanceAvailable -= withdrawAmount;
			}
		}

		public void deposit(double depositMoney) {
			balanceAvailable += depositMoney;
		}

		public double viewBalance(double fundsAvailable) {
			return fundsAvailable;	
		}
	}
	
