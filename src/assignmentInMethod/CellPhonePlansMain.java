package assignmentInMethod;

import java.util.Scanner;

public class CellPhonePlansMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CellphonePlans plans = new CellphonePlans();
		System.out.println("enter the brand you want to choose: Apple/Samsung");
		String enteredBrandName = sc.next();
		plans.phoneProductsAvailable(enteredBrandName);	
	    String enterModelName = sc.next();
	    plans.phoneModelPrices(enterModelName);

//		plans.phoneProductsAvailable("Apple");
//		String modelName = sc.next();

	    System.out.println("select the plan you want to opt for: Rogers/Telus/Bell");
		String enteredProviderName = sc.next();
	    plans.planProviderAvailable(enteredProviderName);
	    plans.monthlyAmountForSamsungPhone();
//	    plans.monthlyAmountForApplePhone();
	}

}
