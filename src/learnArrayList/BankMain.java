package learnArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person sony = new Person("sony", 1234, "rbc0011");
		Person bony = new Person("bony", 2345, "bmo0120");
		Person tony = new Person("tony", 3456, "td0231");
		Person rony = new Person("rony", 4567, "cibc1122");
		Person jony = new Person("jony", 5678, "scotia01");

//		Person[] person = { sony, bony, tony, rony, jony };
//		Person[] person = new Person[5];

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(sony);
		personList.add(bony);
		personList.add(tony);
		personList.add(rony);
		personList.add(jony);

		Bank bank = new Bank();

		System.out.println("enter the name");
		String enteredName = sc.next();
		for (int i = 0; i < personList.size(); i++) {
			if (enteredName.equals(personList.get(i).getName())) {
				System.out.println("enter the pin");
				int enteredPin = sc.nextInt();
				bank.validatePin(personList.get(i), enteredPin);
				break;
			}else {
				System.out.println("name not found");
			}
		}
		
		System.out.println("enter the name");
		String enterName = sc.next();
		for (int i = 0; i < personList.size(); i++) {
			if (enterName.equals(personList.get(i).getName())) {
				personList.remove(i);
			}
		}
		System.out.println(personList.toString());
	}
}
