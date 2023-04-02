package assignment2;
import java.util.Scanner;
public class LogIn {
	
	String userId = "pivotAdmin";
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
			System.out.println("enter the password");
			enteredPassword = sc.next();
			if(enteredUserId.equals(userId) && enteredPassword.equals(password)) {
				System.out.println("you are logged into the application");
					break;
				}else{
				System.out.println("incorrect user Id or password, try again");
			}if ((counter ==3 && enteredPassword != password) || (counter == 3 && enteredUserId != userId)) {
				System.out.println("account is locked");
			}
	}
	
	}
}

