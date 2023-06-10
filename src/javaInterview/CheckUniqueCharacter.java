package javaInterview;

import java.util.Scanner;

public class CheckUniqueCharacter {

	Scanner sc = new Scanner(System.in);

	public void checkUniqueCharacter() {
		System.out.println("enter a word");
		String enteredWord = sc.next();
		for (int i = 0; i < enteredWord.length(); i++) {
			boolean isUnique = true;
			for (int j = 0; j < enteredWord.length(); j++) {
				if (i != j && enteredWord.charAt(i) == enteredWord.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(enteredWord.charAt(i));
			}
		}
	}
}
