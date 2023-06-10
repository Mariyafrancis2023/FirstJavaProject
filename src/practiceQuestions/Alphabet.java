package practiceQuestions;

import java.util.Scanner;

public class Alphabet {

	Scanner sc = new Scanner(System.in);

	public void checkIsVowel() {
		System.out.println("enter an Alphabet");
		char enteredAlphabet = sc.next().charAt(0);
		if (enteredAlphabet == 'a' || enteredAlphabet == 'e' || enteredAlphabet == 'i' || enteredAlphabet == 'o'
				|| enteredAlphabet == 'u') {
			System.out.println("entered Alphabet is vowel");
		} else {
			System.out.println("entered Alphabet is consonant");
		}
	}

	public void checkAlphabet() {
		System.out.println("enter an character");
		char enteredchar = sc.next().charAt(0);
		if ((enteredchar >= 'a' && enteredchar <= 'z') || (enteredchar >= 'A' && enteredchar <= 'Z')) {
			System.out.println("entered character is an Alphabet");
		} else {
			System.out.println("entered character is not an Alphabet");
		}
	}

	public void changeCase() {
		System.out.println("enter a word");
		String enteredWord = sc.next();
		System.out.println("word changed to lowercase is: " + enteredWord.toLowerCase());
		System.out.println("word changed to uppercase is: " + enteredWord.toUpperCase());
	}

	public void removeSecondCharacter() {
		System.out.println("enter a sentence");
		String enteredSentence = sc.nextLine();
		String[] words = enteredSentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if (word.length() > 1) {
				sb.append(word.charAt(0)).append(word.substring(2)).append(" ");
			} else {
				sb.append(word).append(" ");
			}
		}
		System.out.println("new sentence is: " + sb.toString());
	}
}
