package assignment2;
import java.util.Scanner;
public class LogIn {
	
	String userId = "pivotadmin";
	String password = "Admin123";
	String enteredUserId;
	String enteredPassword;
	
	Scanner sc = new Scanner(System.in);
	
	void verifyDetails() {
		
		for(int counter =1; 
				counter<=3; 
				counter++) {
			System.out.println("enter the userId");
			enteredUserId = sc.next();
			if(enteredUserId == userId) {
				System.out.println("entered userId is correct");
				System.out.println("enter the password");
				enteredPassword = sc.next();
				if(enteredPassword == password) {
					System.out.println("entered password is correct, logged in");
					break;
				}
			}else if(enteredUserId == userId && enteredPassword != password){
				System.out.println("entered password is incorrect, try again");
			}else if (counter ==3 && enteredUserId != userId) {
				System.out.println("account is locked");	
			}
		else {
			System.out.println("entered userId is incorrect");
		}
	}
	
	}
}

