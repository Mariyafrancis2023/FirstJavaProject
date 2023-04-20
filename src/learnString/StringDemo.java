package learnString;

import java.util.Scanner;

public class StringDemo {
	String name;
	String[] cities = {"Toronto","Ottawa","Brampton","Hamilton","London","Mississauga","Burlington","Kingston","Kitchener"};
	int i=0;
	Scanner sc = new Scanner(System.in);
	
/////////////////////////FIND IF A CHAR IS PRESENT ON A STRING////////////////////////	
	
	void checkACharactor(String charBeCheck){	
	/*	 name = "abcdefghijklmnop";
		 if(name.contains("g")) {
			 System.out.println("char is found"); 		 
		 }else {
			 System.out.println("char is not found");
		 }  */
		if(name.contains(charBeCheck)) {
			System.out.println(charBeCheck+" is found"); 
		}else {
			 System.out.println(charBeCheck+ " is not found");
		 }
	}
	
///////////////////FIND HOW MANY TIME A CHAR IS PRESENT ON A STRING///////////////////
	
	int numberOfTimeACharOccur (char charToChcek) {
		int counter=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==charToChcek) {
				counter++;
			}		
		}
		return counter;
	}
	
//////////////////////////////FIND A SUBSTRING FROM A STRING//////////////////////////
	
	String findLastName(int indexToBeUsed) {
		String lastName = name.substring(indexToBeUsed);
		return lastName;
	}
	
//////////////////////////////////////////////////////////////////////////////////////
	
	String findCityWithTon() {
		String[] citiesWithTon = new String[5];
		System.out.println("city ending with ton is:");
		for(int i=0;i<cities.length;i++) {
			if(cities[i].endsWith("ton")) {
				citiesWithTon[i] = cities[i];
			}
		}
		return citiesWithTon[i];
	}
	
//////////////////////////////////////////////////////////////////////////////////////
	
	boolean findCityName(String enterCityName) {
		boolean IsCityFound = false;
		for(int i=0;i<cities.length;i++) {
		if(enterCityName.equals(cities[i])) {
				IsCityFound = true;
			}
		}
		return IsCityFound;
	}
	
	
/*	void findCityName(String enterCityName) {
	for(int i=0;i<cities.length;i++) {
		if(enterCityName.equals(cities[i])) {
				System.out.println("city is found");
				break;
			}
		}
		int i=0;
		if (enterCityName!=cities[i]) {
			System.out.println("city is not found");
			i++;
		}  */

}
