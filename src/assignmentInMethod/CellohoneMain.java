package assignmentInMethod;

import java.util.Scanner;

public class CellohoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CellPhonePlan plan = new CellPhonePlan();
	    System.out.println("enter the brand you want to choose: Apple/Samsung");
		String enterBrandName = sc.next();
		plan.getPhoneProductsAvailable(enterBrandName);	
	    String enteredModelName = sc.next();
	    plan.getPhoneModelPrices(enteredModelName);
	    System.out.println("select the plan you want to opt for: Rogers/Telus/Bell");
		String enterProviderName = sc.next();
	    plan.getPlanProviderAvailable(enterProviderName);
	    plan.calculateMonthlyPlanAmount();
	}

}
