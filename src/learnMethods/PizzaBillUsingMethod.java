package learnMethods;

public class PizzaBillUsingMethod {

	String[] pizzaSize = {"small","medium","large"};
	int[] pizzaPrice = {15,20,25};
	int pizzaAmount;
	int additionalPepperoniPrice;
	int additionalCheesePrice;
	int finalPrice;
	int i;
	
	void enterThePizzaSize(String eneteredPizzaSize) {
		for(int i=0; i<pizzaSize.length; i++) {
			if(eneteredPizzaSize.equals(pizzaSize[i])) {
				System.out.println("ordered pizza size is " +pizzaSize[i]+ " and its price is $" +pizzaPrice[i]);
				pizzaAmount = pizzaPrice[i];
				break;
			}
	}
	}
	
	boolean enterPepperoniTopping(String eneteredPizzaSize) {
		boolean isPepperoniNeeded = false;
		if (isPepperoniNeeded=true) {
			if (eneteredPizzaSize.equals("small")) {
				additionalPepperoniPrice = 2;
				System.out.println("additional pepperoni is $" + additionalPepperoniPrice);
			} else if (eneteredPizzaSize.equals("medium") || eneteredPizzaSize.equals("large")) {
				additionalPepperoniPrice = 3;
				System.out.println("additional pepperoni is $" + additionalPepperoniPrice);
			}
		}
		return isPepperoniNeeded;
	}

		
/*		if((additionalPepperoni.equals("yes")) && (eneteredPizzaSize.equals("small"))) {
			additionalPepperoniPrice = 2;	
			System.out.println("additional price for pepperoni is "+additionalPepperoniPrice);
		}else if(additionalPepperoni.equals("no")) {
			additionalPepperoniPrice = 0;
		}
		else{
			additionalPepperoniPrice = 3;
			System.out.println("additional price for pepperoni is "+additionalPepperoniPrice);
		} */
	/*	boolean isPepperoniNeeded = false;
		if(isPepperoniNeeded = true) {
		if(eneteredPizzaSize.equals("small")) {
			additionalPepperoniPrice=2;		
		}else if((eneteredPizzaSize.equals("medium") || eneteredPizzaSize.equals("large"))) {
		    additionalPepperoniPrice=3;
	}else {
	    additionalPepperoniPrice=0;
	}
	}*/
	
	
	boolean enterCheeseTopping() {
		boolean isCheeseNeeded = false;
		if (isCheeseNeeded = true) {
			additionalCheesePrice = 1;
			System.out.println("additional cheese is $" + additionalCheesePrice);
		}
		return isCheeseNeeded;	
}
	void finalBill() {
		finalPrice = pizzaAmount + additionalPepperoniPrice + additionalCheesePrice;
		System.out.println("final bill is $"+finalPrice);
	}
}
