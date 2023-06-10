package practiceQuestions;

import java.util.Scanner;

public class SortingArray_Descending_Ascending {

	int[] number = new int[5];
	Scanner sc = new Scanner(System.in);

	public void descendingOrder() {
		for (int i = 0; i < number.length; i++) {
			System.out.println("enter the number");
			number[i] = sc.nextInt();
		}
		int swapVariable;
		System.out.println("numbers in decending order: ");
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] < number[j]) {
					swapVariable = number[i];
					number[i] = number[j];
					number[j] = swapVariable;
				}
			}
			System.out.println(number[i]);
		}
		System.out.println("largest number in the array is: " + number[0]);
		System.out.println("smallest number in the array is: " + number[4]);
	}

	public void ascendingOrder() {
		for (int i = 0; i < number.length; i++) {
			System.out.println("enter the number");
			number[i] = sc.nextInt();
		}
		int swapVariable;
		System.out.println("numbers in ascending order: ");
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					swapVariable = number[i];
					number[i] = number[j];
					number[j] = swapVariable;
				}
			}
			System.out.println(number[i]);
		}
		System.out.println("largest number in the array is: " + number[4]);
		System.out.println("smallest number in the array is: " + number[0]);
	}
}
