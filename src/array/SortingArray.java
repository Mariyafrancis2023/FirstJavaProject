package array;
import java.util.Scanner;
public class SortingArray {

	int[] numbers = new int[5];
	Scanner sc = new Scanner(System.in);
	
	void decendingOrder() {
		//populating the array
		for(int i=0;i<numbers.length;i++) {
			System.out.println("enter the number");
			numbers[i] = sc.nextInt();
		}
		//printing the array
		System.out.println("entered the numbers are:");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//printing array in decending order 
		System.out.println("entered the numbers in decending order is:");
		int swapVariable;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i] < numbers[j]) {
					swapVariable = numbers[i];
					numbers[i] = numbers[j];
				    numbers[j] = swapVariable;
				}
			}System.out.println(numbers[i]);
		}
		System.out.println("the largest number in list is: " +numbers[0]);
		System.out.println("the smallest number in list is: " +numbers[4]);
	}
}
