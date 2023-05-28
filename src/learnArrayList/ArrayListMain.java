package learnArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> nameList = new ArrayList<String>();
		nameList.add("sony");
		nameList.add("manu");
		nameList.add("jinu");
		nameList.add("bony");
		nameList.add("tinu");
		System.out.println(nameList.toString());

//////////////////// one way to remove a name if we know the index ///////////////////
//		nameList.remove(2);
//		System.out.println(nameList.toString());
		
//		nameList.remove("tinu");
//		System.out.println(nameList.toString());

////////////// another way to remove a name if we don't know the index  //////////////		
/*		System.out.println("enter a name");
		String name = sc.next();
		for (int i = 0; i < nameList.size(); i++) {
			if (name.equals(nameList.get(i))) {
				nameList.remove(i);
			}
		}
		System.out.println("now the length is: " + nameList.size() + " and current names are: " + nameList.toString());
*/
/////////////////////////// replace a name from arraylist ////////////////////////////	
//		nameList.set(1, "rony");
//		System.out.println("name is replaced" + nameList.toString());

		System.out.println("enter a name to be replaced");
		String enterdName = sc.next();
		nameList.set(3, enterdName);
		System.out.println("name is replaced" + nameList.toString());

/////////////////////////// find a name from arraylist ////////////////////////////		
//		nameList.contains("tinu");
//		System.out.println("name is present in the list" + nameList.toString());

		System.out.println("enter a name");
		String enteredName = sc.next();
		if (nameList.contains(enteredName)) {
			System.out.println("name is present in the list");
		} else {
			System.out.println("name not found in the list");
		}
	}
}
