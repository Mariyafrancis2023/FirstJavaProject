package assignmentGuessingGame;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class GuessStudentNameMain {
	
	public static void main(String[] args)throws IOException {
		GuessStudentName guess = new GuessStudentName();
		Scanner sc = new Scanner(System.in);
		List<String> studentListMain = guess.readFile();
		String randomName = guess.getRandomElement(studentListMain);
		guess.hideTheName(randomName);
		int counter = 0;
		while (counter < randomName.length() + 5) {
			System.out.println("guess the letter");
			char letterGuessed = sc.next().charAt(0);
			boolean isFound = guess.guessTheLettersOfName(randomName, letterGuessed);
			if (isFound == false) {
				guess.attempts--;
				System.out.println("wrong input, now you have: " + guess.attempts + " left");
			}
			if (guess.attempts == 0) {
				System.out.println("game over");
				break;
			}
			if (guess.currentName.equals(randomName)) {
				System.out.println("guessed the name "+randomName+ " correctly");
				break;
			}
			counter++;
		}
	}

	}

