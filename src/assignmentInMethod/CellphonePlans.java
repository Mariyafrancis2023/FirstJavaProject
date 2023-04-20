package assignmentInMethod;

import java.util.Scanner;

public class CellphonePlans {

	String[] samsungPhoneModel = { "S22", "S22+", "S22Ultra", "S22FE" };
	int[] samsungPhonePrice = { 25, 35, 55, 20 };
	String[] applePhoneModel = { "Iphone14", "Iphone14pro", "Iphone14promax", "Iphone14mini" };
	int[] applePhonePrice = { 30, 40, 65, 25 };
	String[] planProvider = { "Rogers", "Bell", "Telus" };
	int[] planPrice = { 70, 80, 75 };
	String enteredPhoneName;
	int phoneTabPrice;
	int phonePlanPrice;
	int monthlyAmount;
	int i=0;

	Scanner sc = new Scanner(System.in);

	boolean getSamsungPhonesAndPrice() {
		boolean isenteredPhoneName = true;
		System.out.println("enter the available samsung model");
	    enteredPhoneName = sc.next();
	    for (int i = 0; i < samsungPhoneModel.length; i++) {
	    	if (enteredPhoneName.equals(applePhoneModel[i])) {
				System.out.println("phone tab will be " + samsungPhonePrice[i]);
				phoneTabPrice = samsungPhonePrice[i];
			}
		}
	    return isenteredPhoneName;
		}
		
	void getApplePhonesAndPrice() {
		System.out.println("enter the available apple model");
		enteredPhoneName = sc.next();
		for (int i = 0; i < applePhoneModel.length; i++) {
			if (enteredPhoneName.equals(applePhoneModel[i])) {
				System.out.println("phone tab will be " + applePhonePrice[i]);
				phoneTabPrice = applePhonePrice[i];
			}
		}
	}

	void getPlanProviderAvailable() {
		System.out.println("select the plan you want to opt for: Rogers/Telus/Bell");
		String enterProviderName = sc.next();
		for (int i = 0; i < planProvider.length; i++) {
			if (enterProviderName.equals(planProvider[i])) {
				System.out.println("monthly plan will be: " + planPrice[i]);
				phonePlanPrice = planPrice[i];
				break;
			}
		}
	}

	void calculateMonthlyPlanAmount() {
		monthlyAmount = phoneTabPrice + phonePlanPrice;
		System.out.println("total monthly amount: " + monthlyAmount);
	}
}
