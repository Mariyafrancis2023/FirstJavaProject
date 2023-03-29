package learnStatements;

public class Largest {
  
	int n1=5;
	int n2=44;
	int n3=22;
	
	void largestNumber() {
		if ((n1>n2)&&(n1>n3)){
			System.out.println(n1);
		}
	else if (n2>n3) {
		System.out.println(n2);
	}
	else {
		System.out.println(n3);
	}
	}
}
