package learnArrayList;

public class Bank {

	public void validatePin(Person person, int enteredPin) {
		if (person.getPin() == enteredPin) {
			System.out.println("pin is correct");
		} else {
			System.out.println("incorrect pin");
		}
	}
}
