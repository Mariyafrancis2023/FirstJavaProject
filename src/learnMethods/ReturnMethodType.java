package learnMethods;

public class ReturnMethodType {
	
	String[] pizzaSize = {"small","medium","large"};
	int[] pizzaPrice = {15,20,25};
	int additionalPepperoniPrice;
	int additionalCheesePrice;
	int finalPrice;

	int pizzaBills(String enteredPizzaSize,boolean isPepperoniNeeded, boolean isCheeseNeeded) {
		int count = 0;
		for(int i=0; i<pizzaSize.length; i++) {
			if(enteredPizzaSize.equals(pizzaSize[i])) {
				System.out.println("ordered pizza size is " +pizzaSize[i]+ " and its price is " +pizzaPrice[i]);
		count =i;
				if(isPepperoniNeeded && enteredPizzaSize.equals("small")) {
			additionalPepperoniPrice = 2;
		}else {
			additionalPepperoniPrice = 3;
		}
				if(isCheeseNeeded) {
					additionalCheesePrice = 1;				
				}
	}
}
		finalPrice = pizzaPrice[count]+additionalPepperoniPrice+additionalCheesePrice;
		return finalPrice;
}
}

