package learnString;

import java.util.Scanner;

public class StringDemo {
	String name;
	Scanner sc = new Scanner(System.in);
	
	void checkACharactor(String charBeCheck){	
	/*	 name = "asdfghjkl";
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

}
