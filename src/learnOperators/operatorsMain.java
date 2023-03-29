package learnOperators;

public class operatorsMain {

	public static void main(String[] args) {
		ArithematicOperations ao =  new ArithematicOperations();
		ao.num1 = 12;
		ao.num2 = 7;
		ao.addition();
		ao.substraction();
		ao.multiplication();
		ao.division();
		
		AssignmentOperators aso = new AssignmentOperators();
		aso.addequalto();
		aso.minusequalto();
		aso.x = 5;
		aso.multiplicationequalto();
	}
}
