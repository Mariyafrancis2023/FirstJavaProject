package assignmentGuessingGame;

import java.util.List;
import java.io.IOException;

public class GuessNameMain {

	public static void main(String[] args) throws IOException {
		GuessName guess = new GuessName();
		List<String> list = guess.getStudentNameFromFile();
		System.out.println(list);

	}

}
