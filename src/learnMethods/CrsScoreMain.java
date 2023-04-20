package learnMethods;

import java.util.Scanner;

public class CrsScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CrsScoreUsingMethod score = new CrsScoreUsingMethod();
		
		System.out.println("enter the education level");
		String education = sc.next();
		score.calculateEducationPoints(education);
		
		System.out.println("enter years of experience");
		int experience = sc.nextInt();
		int exp = score.calculateExperiencePoints(experience);
		System.out.println("points for "+experience+" year experence is "+exp);
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		int a = score.calculateAgePoints(age);
		System.out.println("points for age "+age+" is "+a);
		
		score.calculateIeltsPoints("listening");
		System.out.println("points for listening is "+score.listeningPoint);

		score.calculateIeltsPoints("speaking");
		System.out.println("points for speaking is "+score.speakingPoint);
	
		score.calculateIeltsPoints("reading");
		System.out.println("points for reading is "+score.readingPoint);
	
		score.calculateIeltsPoints("writing");
		System.out.println("points for writing is "+score.writingPoint);  
		
		score.calculateAdaptabilityPoints();
		score.calculateEligibility();
	}

}
