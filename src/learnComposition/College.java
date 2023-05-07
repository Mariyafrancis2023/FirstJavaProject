package learnComposition;

public class College {

	private PersonDetails[] person = new PersonDetails[5];

	public void addStudentsToClass(PersonDetails studentName) {
		for (int i = 0; i < person.length; i++) {
			if (person[i] == null) {
				person[i] = studentName;
				break;
			}
		}
	}

	public int getMarksObtained(String studentName) {
		int marksObtained = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getName().equals(studentName)) {
				marksObtained = person[i].getMarks();
				break;
			}
		}
		return marksObtained;
	}
}
