package interviewSession;
import java.util.Scanner;
public class InterviewQuestion {
	
	int[] number = {2,3,2,2,4,2,2};
	int[] number1 = {3,2,7,2,8,2,5,4};
	int counter=0;
	Scanner sc = new Scanner(System.in);
	
	void findTheCountForNumber2() {
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
			if(number[i]==2) {
				counter++;
			}
		}System.out.println("the number of times 2 is present in array is" +counter);

	}
	
	void replaceNumber() {
		System.out.println("enter the which number that has to be replaced");
		int numberToBeReplaced = sc.nextInt();
		System.out.println("enter the number that can use as replacement");
		int numberUsedForReplacement = sc.nextInt();
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]); 
			if(number[i]==numberToBeReplaced) {
				number[i]=numberUsedForReplacement;
			}System.out.println(number[i]);
		}
	}
	
	void sumOf2InArray() {
		for(int i=0; i<number1.length; i++) {
			if(number1[i]==2) {
				counter++;
			}
		}if(counter==4) {
			System.out.println("the sum of 2 in array is 8");
		}else {
			System.out.println("the sum of 2 in array is not 8");
		}
	}
	

}
