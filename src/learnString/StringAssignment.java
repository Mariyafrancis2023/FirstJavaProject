package learnString;

import java.util.Scanner;

public class StringAssignment {
	
	String[] cities = {"Toronto","Ottawa","Brampton","Hamilton","London","Mississauga","Burlington","Kingston","Kitchener"};
	
    Scanner sc = new Scanner(System.in);

		void findCityName(String enterCityName) {
	
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
			}
		}
		
		void findCityWithTon() {
			System.out.println("city ending with ton is:");
			for(int i=0;i<cities.length;i++) {
				if(cities[i].endsWith("ton")) {
					System.out.println(cities[i]);
				}
			}
		}
		
		void replacingTonWithFun() {
			System.out.println("city replaced with fun is:");
			for(int i=0;i<cities.length;i++) {
				if(cities[i].endsWith("ton")) {
					cities[i]=cities[i].replace("ton","fun") ;
					System.out.println(cities[i]);	
				}			
			}			
		}
		
		void splitingAddress() {
			String address = "100 queen street,Toronto,M5V 3E3";
			String[] splitAddress = address.split(",");
			System.out.println("street address: "+splitAddress[0]);
			System.out.println("city: "+splitAddress[1]);
			System.out.println("zip: "+splitAddress[2]);
		}
	}

