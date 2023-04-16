package assignmentInMethod;

import java.util.Scanner;

public class CellphonePlans {

	String[] samsungPhoneModel = { "S22", "S22+", "S22Ultra", "S22FE" };
	int[] samsungPhonePrice = { 25, 35, 55, 20 };
	String[] applePhoneModel = { "Iphone14", "Iphone14pro", "Iphone14promax", "Iphone14mini" };
	int[] applePhonePrice = { 30, 40, 65, 25 };
	String[] planProvider = { "Rogers", "Bell", "Telus" };
	int[] planPrice = { 70, 80, 75 };
	String android = "Samsung";
	String ios = "Apple";
	int samsungPhoneTab;
	int applePhoneTab;
	int phonePlanPrice;
	int monthlyAmount;

	Scanner sc = new Scanner(System.in);

	void phoneProductsAvailable(String enteredBrandName) {
		System.out.println("enter the model you want to buy from below");
		if (enteredBrandName.equals(android)) {
			for (int i = 0; i < samsungPhoneModel.length; i++) {
				System.out.println(samsungPhoneModel[i]);
			}
		} else if (enteredBrandName.equals(ios)) {
			for (int i = 0; i < applePhoneModel.length; i++) {
				System.out.println(applePhoneModel[i]);
			}
		}
	}
	void phoneModelPrices(String enterModelName) {
		for (int i = 0; i < samsungPhoneModel.length; i++) {
		if(enterModelName.equals(samsungPhoneModel[i])) {
			System.out.println("phone tab will be: " +samsungPhonePrice[i]);
			samsungPhoneTab=samsungPhonePrice[i];
			break;
		}			
		}
		for (int i = 0; i < applePhoneModel.length; i++) {
			if(enterModelName.equals(applePhoneModel[i])) {
				System.out.println("phone tab will be: " +applePhonePrice[i]);	
				applePhoneTab=applePhonePrice[i];
				break;
			}			
			}
	}
/*	void applePhoneAvailable(String enteredBrandName) {
		if (enteredBrandName.equals(ios)) {
			System.out.println("enter the model you want to buy from below");
			for (int i = 0; i < applePhoneModel.length; i++) {
				System.out.println(applePhoneModel[i]);
			}
		}
	}    */

	void planProviderAvailable(String enteredProviderName) {
		for (int i = 0; i < planProvider.length; i++) {
			if (enteredProviderName.equals(planProvider[i])) {
				System.out.println("monthly plan will be: " +planPrice[i]);	
				phonePlanPrice=planPrice[i];
				break;
			}
		}
	}
	
	void monthlyAmountForSamsungPhone() {
		int monthlyAmount = samsungPhoneTab + phonePlanPrice;
		System.out.println("total monthly amount: "+monthlyAmount);
	}
	void monthlyAmountForApplePhone() {
		int monthlyAmount = applePhoneTab + phonePlanPrice; 
		System.out.println("total monthly amount: "+monthlyAmount);
	}  

}
