package learnMethods;

public class PizzaBillUsingMethod {

	String[] pizzaSize = {"small","medium","large"};
	int[] pizzaPrice = {15,20,25};
	int additionalPepperoniPrice;
	int additionalCheesePrice;
	int finalPrice;
	
	void enterThePizzaSize(String eneteredPizzaSize) {
		for(int i=0; i<pizzaSize.length; i++) {
			if(eneteredPizzaSize.equals(pizzaSize[i])) {
				System.out.println("ordered pizza size is " +pizzaSize[i]+ " and its price is " +pizzaPrice[i]);
			}
	}
	}
	
	void enterPepperoniTopping(String eneteredPizzaSize, boolean isPepperoniNeeded) {
		if(isPepperoniNeeded && eneteredPizzaSize.equals("small")) {
			additionalPepperoniPrice=2;		
		}else {
		    additionalPepperoniPrice=3;
	}
	}
	
	int enterCheeseTopping(String eneteredPizzaSize, boolean isCheeseNeeded) {
		for(int i=0;i<pizzaSize.length;i++) {
		if(isCheeseNeeded && eneteredPizzaSize.equals(pizzaSize[i])) {
			additionalCheesePrice=1;
			finalPrice = pizzaPrice[i]+additionalCheesePrice;
		}
	}			return finalPrice;
}
}
