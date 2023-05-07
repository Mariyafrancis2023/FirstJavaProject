package learnAbstraction;

public class PersonAccountDetails {

	private String bankAccountNumber;
	private String name;
	private double fundsAvailable;
	private String pin;
	private String onlineBankingPassword;

	public PersonAccountDetails(String bankAccountNumber, String name, double fundsAvailable, String pin,
			String onlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.name = name;
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public String getName() {
		return name;
	}

	public double getFundsAvailable() {
		return fundsAvailable;
	}
}
