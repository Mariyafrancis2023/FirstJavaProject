package assignmentInMethod;

import java.util.Arrays;
import java.util.Scanner;

public class CellPhonePlansMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CellphonePlans plans = new CellphonePlans();
		System.out.println("enter the brand you want to choose: Apple/Samsung");
		String enterBrandName = sc.next();	
		System.out.println("available products are: "+Arrays.toString(plans.samsungPhoneModel));
		boolean isenteredPhoneName = false;
		do {
		plans.getSamsungPhonesAndPrice();
		}
		while(isenteredPhoneName = true);
		System.out.println("available products are: "+Arrays.toString(plans.applePhoneModel));		
		plans.getApplePhonesAndPrice();
		plans.getPlanProviderAvailable();
		plans.calculateMonthlyPlanAmount();
	    
/////****************************************************************************/////	    
	/*  CellPhonePlan plan = new CellPhonePlan();
	    System.out.println("enter the brand you want to choose: Apple/Samsung");
		String enterBrandName = sc.next();
		plan.getPhoneProductsAvailable(enterBrandName);	
	    String enteredModelName = sc.next();
	    plan.getPhoneModelPrices(enteredModelName);
	    System.out.println("select the plan you want to opt for: Rogers/Telus/Bell");
		String enterProviderName = sc.next();
	    plan.getPlanProviderAvailable(enterProviderName);
	    plan.calculateMonthlyPlanAmount();     */

	}

}
