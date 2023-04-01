package assignment2;

public class Chocolates {

	int totalChocolate = 63;
	int currentNoOfChocolate = 27;
	
	void chocolateBox() {
		
		while(currentNoOfChocolate <= totalChocolate);{
		System.out.println("add chocolates, no: of chocolates in box is: " + currentNoOfChocolate);
		currentNoOfChocolate+=5;
		
		if(currentNoOfChocolate == totalChocolate) {
		System.out.println("chocolate box is full: " + currentNoOfChocolate);
		}
		}
		}
	}

/*
do{
	System.out.println("add chocolates, no: of chocolates in box is: " + currentNoOfChocolate);
	currentNoOfChocolate+=5;
}

while(currentNoOfChocolate <= totalChocolate);
*/