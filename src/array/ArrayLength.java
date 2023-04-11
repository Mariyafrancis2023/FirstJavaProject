package array;

public class ArrayLength {
	
	int[] number = {1,2,3,4,5};
	
	void findLength() {
		System.out.println("array length is: " + number.length);
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	}
	
 // finding same name in array using for loop
	String[] studentName = {"abc","def","ghi","abc", "jkl","mno","abc"};
	
	void findStudent() {
		String name = "ghi";
		for(int i=0;i<studentName.length;i++) {
			if(studentName[i].equals(name)) {
			System.out.println("found " +name+ " at index " +i);
			}
		}
	}
	
 // replace or update studentName "mno" with another name "xyz"
	
	void replaceStudentName() {
		String name1 = "mno";		
		for(int i=0;i<studentName.length;i++) {
			if(studentName[i].equals(name1)) {
				studentName[i] = "xyz";
				System.out.println("now name at index " +i+ " is " +studentName[i]);	
			}
			}
	}
	
 // find how many time the same name is present in array
	
	void findRepeatedName() {
		String name2 = "abc";
		int count = 0;
		for(int i=0;i<studentName.length;i++) {
			if(studentName[i].equals(name2)) {
				System.out.println("the " +name2+ " is present at index " +i);	
				count++;
			}
			}System.out.println("the no of times " +name2+ " present is " +count);
 	}
}

