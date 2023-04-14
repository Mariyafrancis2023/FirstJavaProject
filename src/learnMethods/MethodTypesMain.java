package learnMethods;

import java.util.Scanner;

public class MethodTypesMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//****************************Method With Parameters/Arguments****************************		
		MethodTypes pizza = new MethodTypes();		
	//	pizza.pizzaBill("small");	
		System.out.println("enter the pizza size");
		String enteredPizzaSize = sc.next();
	//	pizza.pizzaBill(enteredPizzaSize);		
    	pizza.pizzaBill(enteredPizzaSize, true, true);
	
//****************************Method With Return Type***********************************	
	/*	ReturnMethodType pizzaa = new ReturnMethodType();
		pizzaa.pizzaBills(enteredPizzaSize, true, true);
		System.out.println(pizzaa.finalPrice);    */
	}

}
