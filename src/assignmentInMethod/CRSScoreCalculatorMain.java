package assignmentInMethod;

import java.util.Scanner;

public class CRSScoreCalculatorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CRSScoreCalculator score = new CRSScoreCalculator();
		
		System.out.println("enter the education level");
		String education = sc.next();
		score.calculateEducationPoints(education);
		
		System.out.println("enter years of experience");
		int experience = sc.nextInt();
		score.calculateExperiencePoints(experience);
		System.out.println("points for "+experience+" year experence is "+score.experiencePoints);
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		score.calculateAgePoints(age);
		System.out.println("points for age "+age+" is "+score.agePoints);
		
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



