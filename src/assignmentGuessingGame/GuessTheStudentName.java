package assignmentGuessingGame;

import java.util.Random;

public class GuessTheStudentName {

	String[] studentName = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };
	int attempts = 5;
	String letterStoringArray = "";
	String currentName;

	StringBuilder sb = new StringBuilder(letterStoringArray);

	String pickRandomStudentName() {
		Random name = new Random();
		int nameIndex = name.nextInt(studentName.length);
		return studentName[nameIndex];
	}

	void hideTheName(String randomName) {
		for (int i = 0; i < randomName.length(); i++) {
			sb.insert(i, '_');

		}
		System.out.println("you are guessing " + sb.toString());
	}

	boolean guessTheLettersOfName(String randomName, char letterGuessed) {
		boolean isLetterFound = false;
		for (int i = 0; i < randomName.length(); i++) {
			if (randomName.charAt(i) == letterGuessed) {
				sb.setCharAt(i, letterGuessed);
				isLetterFound = true;
			}
		}
		currentName = sb.toString();
		System.out.println(sb.toString());
		return isLetterFound;
	}
}
