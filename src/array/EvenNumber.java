package array;

public class EvenNumber {
	
	int[] evenArray = new int[5];
	
	void evenNumbers() {
	int count = 0;
		for(int number = 2; count<=4; number++) {	
			
			if(number %2 == 0) {
				evenArray[count] = number;
				System.out.println(number);
				count++;
			}
		}
	}
}
