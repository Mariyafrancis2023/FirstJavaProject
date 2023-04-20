package learnString;

import java.util.Scanner;

public class StringAssignmentMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		StringAssignment city = new StringAssignment();
		System.out.println("enter the city name");
		String enterCityName = sc.next();
		city.findCityName(enterCityName);
		city.findCityWithTon();
		city.replacingTonWithFun();
		city.splitingAddress();	
		}
	}


