package learnComposition;

import java.util.Scanner;

public class DealershipMain {

	public static void main(String[] args) {

		Dealership ds = new Dealership();
		Car hondaCivic = new Car("Honda", "White", 5, 24000);
		ds.addCarsToDealership(hondaCivic);
		Car kiaSeltos = new Car("Kia", "Blue", 5, 20000);
		ds.addCarsToDealership(kiaSeltos);
		Car toyotaCorolla = new Car("Toyota", "Black", 5, 22000);
		ds.addCarsToDealership(toyotaCorolla);

		/*
		  Car[] addCars = new Car[3]; 
		  addCars[0] = new Car("Honda", "White", 5, 24000);
		  addCars[1] = new Car("Kia", "Blue", 5, 20000); 
		  addCars[2] = new Car("Toyota", "Black", 5, 22000); 
		  ds.addCarsToDealership(addCars);
		 */

		Car[] carBroughtToDealership = { hondaCivic, kiaSeltos, toyotaCorolla };
		ds.addCarsToDealership(carBroughtToDealership);

		Scanner sc = new Scanner(System.in);
		System.out.println("select the brand available: Honda, Kia or Toyota");
		String carRequested = sc.next();
		double priceOfRequestedCar = ds.getRequestedCarPrice(carRequested);
		System.out.println("Price for the car: " + priceOfRequestedCar);
	}
}
