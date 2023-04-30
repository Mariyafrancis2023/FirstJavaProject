package assignmentGuessingGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessName {

	public List<String> getStudentNameFromFile() throws IOException{
		List<String> studentList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("namelist.txt"));
		String str;
		while ((str = br.readLine()) != null) {
			studentList.add(str);
		}
		return studentList;
	}
}
