package array;

public class SumOfEvenNumber {
	
	int[] evenNumber = new int [100];
	int sum;
	
	void evenNumberSum() {
		for(int i=0;i<evenNumber.length;i++) {
			if(i %2 == 0) {
				sum+=i;
			}
		}System.out.println("sum of number is "+sum);
	}
}
