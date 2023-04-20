package learnString;

import java.util.Scanner;

public class StringDemoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringDemo demo = new StringDemo();
		
		demo.name = "abcdefghabcdeabca";
		
		System.out.println("enter the char");
		String charBeCheck = sc.next();
		demo.checkACharactor(charBeCheck);
		
		int count = demo.numberOfTimeACharOccur('a');
		System.out.println("no: of time char present is "+count);
		
		String lastName = demo.findLastName(8);
		System.out.println("the substring is "+lastName);
		
//		String cityWithTon = demo.findCityWithTon();
//		System.out.println(cityWithTon);
		
		boolean cityFound = demo.findCityName("windsor");
		if(cityFound) {
			System.out.println("city found");
		}else {
			System.out.println("city not found");
		}
		
//		demo.findCityName(enterCityName);
	}

}
