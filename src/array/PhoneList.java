package array;
import java.util.Scanner;

public class PhoneList {

	String[] samsungPhone = {"S20", "S21", "Flip3", "Fold3"};
	String[] googlePhone = {"GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5"};
	String[] applePhone = {"Iphone12", "Iphone12 mini", "Iphone11", "Iphone11 Pro"};
	String brandNameS = "samsung";
	String brandNameG = "google";
	String brandNameA = "apple";
	String enteredBrandName;
	String enteredPhoneName;
	boolean isPhoneAvaialble;
	
	
	Scanner sc = new Scanner(System.in);

	void phoneAvailable() {
		System.out.println("enter the phone brand name");
		enteredBrandName = sc.next();
		if (enteredBrandName.equals(brandNameS)) {
			System.out.println("the phones available for this brand: ");
			for (int i = 0; i < samsungPhone.length; i++) {
				System.out.println(samsungPhone[i]);
			}

			System.out.println("enter the phone name");
			enteredPhoneName = sc.next();
			for (int i = 0; i < samsungPhone.length; i++) {
				if (enteredPhoneName.equals(samsungPhone[i])) {
					isPhoneAvaialble = true;
				}
			}

			if (isPhoneAvaialble == true) {
				System.out.println("the phone is available");
			} else {
				System.out.println("the phone is not available");
			}
		}
		else if(enteredBrandName.equals(brandNameG)) {
			System.out.println("the phones available for this brand: ");
			for (int i = 0; i < googlePhone.length; i++) {
				System.out.println(googlePhone[i]);
			}

			System.out.println("enter the phone name");
			enteredPhoneName = sc.next();		
			for (int i=0; i<googlePhone.length; i++) {
				
				if (enteredPhoneName.equals(googlePhone[i])) {
					isPhoneAvaialble = true;
				}
			}
			if (isPhoneAvaialble == true) {
				System.out.println("the phone is available");
			} else {
				System.out.println("the phone is not available");
			}
		}
		else if(enteredBrandName.equals(brandNameA)) {
			System.out.println("the phones available for this brand: ");
		 for (int i=0; i<applePhone.length; i++) {
			 System.out.println(applePhone[i]);
		 }
		  System.out.println("enter the phone name");
			enteredPhoneName = sc.next();
			for (int i=0; i<applePhone.length; i++) {
			if(enteredPhoneName.equals(applePhone[i])) {
				isPhoneAvaialble = true;
			} 
			}
			if (isPhoneAvaialble == true) {
				System.out.println("the phone is available");
			} else {
				System.out.println("the phone is not available");
			}
		} else {
			System.out.println("the entered brand is not available");
		}
		
	}
	}
