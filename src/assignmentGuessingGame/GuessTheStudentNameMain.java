package assignmentGuessingGame;

import java.util.Scanner;

public class GuessTheStudentNameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GuessTheStudentName game = new GuessTheStudentName();
		String randomName = game.pickingStudentNameRandomly();
		System.out.println(randomName);
		System.out.println("length is: " + randomName.length());
		game.hidingTheNameUsingUnderscores(randomName);
		int counter = 0;
		while (counter < randomName.length() + 5) {
			System.out.println("guess the letter");
			char letterGuessed = sc.next().charAt(0);
			boolean isFound = game.guessingTheLettersOfName(randomName, letterGuessed);
			if (isFound == false) {
				game.attempts--;
				System.out.println("wrong input, now you have: " + game.attempts + " left");
			}
			if (game.attempts == 0) {
				System.out.println("game over");
				break;
			}
			if (game.currentName.equals(randomName)) {
				System.out.println("guessed the name "+randomName+ " correctly");
				break;
			}
			counter++;
		}
	}

}
