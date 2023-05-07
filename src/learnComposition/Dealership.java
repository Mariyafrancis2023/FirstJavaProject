package learnComposition;

import java.util.Arrays;

public class Dealership {

	private Car[] carList = new Car[3];

	public void addCarsToDealership(Car carBroughtToDealership) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = carBroughtToDealership;
				System.out.println(carList[i].getBrandName());
				break;
			}
		}
	}

	public void addCarsToDealership(Car[] carBroughtToDealership) {
		for (int i = 0; i < carBroughtToDealership.length; i++) {
			for (int j = 0; j < carList.length; j++) {
				if (carList[j] == null) {
					carList[j] = carBroughtToDealership[i];
					System.out.println(carList[j]);
					break;
				}
			}
		}
	}

	public double getRequestedCarPrice(String carRequested) {
		double priceOfRequestedCar = 0;
		for (int i = 0; i < carList.length; i++) {
			if (carList[i].getBrandName().equals(carRequested)) {
				priceOfRequestedCar = carList[i].getPriceOfCar();
				break;
			}
		}
		return priceOfRequestedCar;
	}
}
