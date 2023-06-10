package practiceQuestions;

import java.util.Scanner;

public class ReverseString {

	Scanner sc = new Scanner(System.in);
	String word = "";
	char letter;
	StringBuilder sb = new StringBuilder();

	public void checkPalindrome() {
		System.out.println("enter a word");
		String enterWord = sc.next();
		for (int i = enterWord.length() - 1; i >= 0; i--) {
			word = word + enterWord.charAt(i);
//			System.out.println(word);
			if (enterWord.equals(word)) {
				System.out.println("entered string is palindrome");
			}
		}
		System.out.println("reversed string is: " + word);
	}

	public void reverseAString() {
		System.out.println("enter a word");
		String enterWord = sc.next();
		for (int i = 0; i < enterWord.length(); i++) {
			letter = enterWord.charAt(i);
//			System.out.println(letter);
			word = letter + word;
//			System.out.println(word);
		}
		System.out.println("reversed string is: " + word);
	}

	public void reverseString() {
		System.out.println("enter a word");
		String enterWord = sc.next();
		sb.append(enterWord);
		sb.reverse();
		System.out.println("reversed string is: " + sb.toString());
	}

	public void lengthOfString() {
		System.out.println("enter a word");
		String enterWord = sc.next();
		System.out.println("length of entered string is: " + enterWord.length());
	}
}
