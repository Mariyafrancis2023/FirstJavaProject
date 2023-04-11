package array;
import java.util.Scanner;
public class PizzaBill {

	String[] pizzaSize = {"small","medium","large"};
	int[] pizzaPrice = {15,20,25};
	String enteredSize;
	int additionalPepperoniPrice;
	int additionalCheesePrice;
	int finalPrice;
	
	Scanner sc = new Scanner(System.in);
	
	void pizzaFinalBill() {
		int count = 0;
		System.out.println("enter the pizza size");
		enteredSize = sc.next();
		for(int i=0; i<pizzaSize.length; i++) {
			if(enteredSize.equals(pizzaSize[i])) {
				System.out.println("ordered pizza size is " +pizzaSize[i]+ " and its price is " +pizzaPrice[i]);
				count = i;
			}
		}
		System.out.println("enter if additional pepperoni needed");
		String additionalPepperoni = sc.next();
		if((additionalPepperoni.equals("yes")) && (enteredSize.equals("small"))) {
			additionalPepperoniPrice = 2;	
			System.out.println("additional price for pepperoni is "+additionalPepperoniPrice);
		}else if(additionalPepperoni.equals("no")) {
			additionalPepperoniPrice = 0;
		}
		else{
			additionalPepperoniPrice = 3;
			System.out.println("additional price for pepperoni is "+additionalPepperoniPrice);
		}
		System.out.println("enter if additional cheese needed");
		String additionalCheese = sc.next();
		if(additionalCheese.equals("yes")) {
			additionalCheesePrice = 1;
			System.out.println("additional price for cheese is "+additionalCheesePrice);
		}else if(additionalCheese.equals("no")) {
			additionalCheesePrice = 0;
		}	
    	finalPrice = pizzaPrice[count] + additionalPepperoniPrice + additionalCheesePrice;
    	System.out.println("the final price is "+finalPrice);
	}
	
}
