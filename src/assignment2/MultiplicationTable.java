package assignment2;
import java.util.Scanner;
public class MultiplicationTable {

	int number1;
	
	Scanner sc = new Scanner(System.in);
	
	void printMultiple() {
		
		System.out.println("enter the number");
		number1 = sc.nextInt();
		System.out.println("the multiplication table of " + number1 + " is ");
		for(int number = 1; 
				number<=10; 
				number++) {
			System.out.println(number + "*" + number1 + "=" + number*number1);	
		}
	}

}
