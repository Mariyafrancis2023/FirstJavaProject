package assignment2;

public class Chocolates {

	int totalChocolate = 63;
	int currentNoOfChocolate = 27;
	
	void chocolateBox() {
		
		while(currentNoOfChocolate <= totalChocolate) {
			System.out.println("add chocolate, no: of chocolates is " + currentNoOfChocolate);
			currentNoOfChocolate+=5;
			
			if(currentNoOfChocolate == totalChocolate) {
				System.out.println("box is full " + currentNoOfChocolate);
				break;
			}
		}
	}
	}
