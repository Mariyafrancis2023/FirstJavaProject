package learnMethods;

import java.util.Scanner;

public class PizzaBillUsingMethodMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PizzaBillUsingMethod bill = new PizzaBillUsingMethod();
		System.out.println("enter pizza size");
		String eneteredPizzaSize = sc.next();
		
		bill.enterThePizzaSize(eneteredPizzaSize);
			
		bill.enterPepperoniTopping(eneteredPizzaSize);
		
		bill.enterCheeseTopping();
		
		bill.finalBill();
		}
	}


