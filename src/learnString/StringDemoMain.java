package learnString;

import java.util.Scanner;

public class StringDemoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringDemo demo = new StringDemo();
		demo.name = "qwertyuiop";
		System.out.println("enter the char");
		String charBeCheck = sc.next();
		demo.checkACharactor(charBeCheck);
		

	}

}
