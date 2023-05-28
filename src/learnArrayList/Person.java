package learnArrayList;

public class Person {

	private String name;
	private int pin;
	private String accountNumber;

	public Person(String name, int pin, String accountNumber) {
		super();
		this.name = name;
		this.pin = pin;
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public int getPin() {
		return pin;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}
