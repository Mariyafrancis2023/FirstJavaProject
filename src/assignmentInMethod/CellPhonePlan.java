package assignmentInMethod;

import java.util.Scanner;

public class CellPhonePlan {
	String[] samsungPhoneModel = { "S22", "S22+", "S22Ultra", "S22FE" };
	int[] samsungPhonePrice = { 25, 35, 55, 20 };
	String[] applePhoneModel = { "Iphone14", "Iphone14pro", "Iphone14promax", "Iphone14mini" };
	int[] applePhonePrice = { 30, 40, 65, 25 };
	String[] planProvider = { "Rogers", "Bell", "Telus" };
	int[] planPrice = { 70, 80, 75 };
	String android = "Samsung";
	String ios = "Apple";
	int phoneTabPrice;
	int phonePlanPrice;
	int monthlyAmount;

	Scanner sc = new Scanner(System.in);

	void getPhoneProductsAvailable(String enterBrandName) {
		System.out.println("enter the model you want to buy from below");
		if (enterBrandName.equals(android)) {
			for (int i = 0; i < samsungPhoneModel.length; i++) {
				System.out.println(samsungPhoneModel[i]);
			}
		} else if (enterBrandName.equals(ios)) {
			for (int i = 0; i < applePhoneModel.length; i++) {
				System.out.println(applePhoneModel[i]);
			}
		}
	}
	void getPhoneModelPrices(String enteredModelName) {
		for (int i = 0; i < samsungPhoneModel.length; i++) {
		if(enteredModelName.equals(samsungPhoneModel[i])) {
			System.out.println("phone tab will be: " +samsungPhonePrice[i]);
			phoneTabPrice=samsungPhonePrice[i];
			break;
		}			
		}
		for (int i = 0; i < applePhoneModel.length; i++) {
			if(enteredModelName.equals(applePhoneModel[i])) {
				System.out.println("phone tab will be: " +applePhonePrice[i]);	
				phoneTabPrice=applePhonePrice[i];
				break;
			}			
			}
	}

	void getPlanProviderAvailable(String enterProviderName) {
		for (int i = 0; i < planProvider.length; i++) {
			if (enterProviderName.equals(planProvider[i])) {
				System.out.println("monthly plan will be: " +planPrice[i]);	
				phonePlanPrice=planPrice[i];
				break;
			}
		}
	}
	
	void calculateMonthlyPlanAmount() {
		monthlyAmount = phoneTabPrice + phonePlanPrice;
		System.out.println("total monthly amount: "+monthlyAmount);
	}
}
