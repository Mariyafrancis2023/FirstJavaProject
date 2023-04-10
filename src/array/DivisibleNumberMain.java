package array;
import java.util.Arrays;
public class DivisibleNumberMain {

	public static void main(String[] args) {

     DivisibleNumber divisible = new DivisibleNumber();
     
     divisible.numberDivisibleBy3And5();
     
     System.out.println(Arrays.toString(divisible.divisbleArray));

	}

}
