package array;

public class DivisibleNumber {

	int[] divisbleArray = new int[10];
	int arrayIndex = 0;
	
	void numberDivisibleBy3And5() {
		
		for(int number = 1; arrayIndex <=9; number++) {
			
			if((number %3 == 0) && (number %5 == 0)) {
				divisbleArray[arrayIndex] = number;
				arrayIndex++;
			}
		}
	}
}
