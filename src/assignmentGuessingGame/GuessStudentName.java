package assignmentGuessingGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessStudentName {
	int attempts = 5;
	String letterStoringArray = "";
	String currentName;
	StringBuilder sb = new StringBuilder(letterStoringArray);
	List<String> studentList = new ArrayList<String>();
	String studentName;
	Scanner sc = new Scanner(System.in);

	public List<String> readFile() throws IOException {
		FileReader fr = new FileReader("namelist.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			studentList.add(str);
		}
		return studentList;
	}

	String randomName = getRandomElement(studentList);

	void hideTheName(String randomName) {
		for (int i = 0; i < randomName.length(); i++) {
			sb.insert(i, '_');

		}
		System.out.println("you are guessing " + sb.toString());
	}

	private String getRandomElement(List<String> studentList2) {
		return null;
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
