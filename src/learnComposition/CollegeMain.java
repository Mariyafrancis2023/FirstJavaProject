package learnComposition;

import java.util.Scanner;

public class CollegeMain {

	public static void main(String[] args) {

		PersonDetails sony = new PersonDetails("sony", "brampton", 20, "degree", 65);
		PersonDetails bony = new PersonDetails("bony", "kingston", 22, "degree", 75);
		PersonDetails tony = new PersonDetails("tony", "oakville", 23, "btech", 80);
		PersonDetails rony = new PersonDetails("rony", "bellville", 21, "btech", 60);
		PersonDetails jony = new PersonDetails("jony", "milton", 19, "diploma", 70);

		College college = new College();

		college.addStudentsToClass(sony);
		college.addStudentsToClass(bony);
		college.addStudentsToClass(tony);
		college.addStudentsToClass(rony);
		college.addStudentsToClass(jony);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student name");
		String studentName = sc.next();
		int marksObtained = college.getMarksObtained(studentName);
		System.out.println("mark of " + studentName + " is " + marksObtained);

	}
}
