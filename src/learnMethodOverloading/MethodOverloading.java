package learnMethodOverloading;

public class MethodOverloading {
//	MethodOverloading is done by 3 ways
//1. the number of parameters in two methods
	
	public void multiply(int num1, int num2) {  
		int product = num1 * num2;
		System.out.println("Product is: " + product);
	}
	
	public void multiply(int num1, int num2, int num3) {
		int product = num1 * num2 * num3;
		System.out.println("Product is: " + product);
	}

//2. the data types of parameters of methods
	
	public void multiply(double num1, double num2) {
		double product = num1 * num2;
		System.out.println("Product is: " + product);
	}
	
//3. order of parameters of methods	
	
	public void multiply(int num1, double num2) {
		double product = num1 * num2;
		System.out.println("Product is: " + product);
	}
	
	public void multiply(double num1, int num2) {
		double product = num1 * num2;
		System.out.println("Product is: " + product);
	}
}
