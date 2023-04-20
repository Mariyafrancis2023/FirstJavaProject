package assignmentInMethod;

import java.util.Scanner;

public class CRSScoreCalculator {

	String[] educationLevel = {"PhD","masters","universityDegree/Diploma","12th+Degree/Diploma"};
	int[] educationPoints = {25,23,22,21};
	int experiencePoints;
	int agePoints;
	int ieltsPoints;
	int adaptabilityPoints;
	int educationLevelPoints;
	int totalPoints;
	int listeningPoint, speakingPoint, readingPoint, writingPoint;		

	
	Scanner sc = new Scanner(System.in);
	
	void calculateEducationPoints(String education) {
			for(int i=0;i<educationLevel.length;i++) {
				if(education.equals(educationLevel[i])) {
				System.out.println("points for "+educationLevel[i]+ " is "+educationPoints[i]);
				educationLevelPoints=educationPoints[i];
				break;
			}
		}
	}
	
	void calculateExperiencePoints(int experience) {
		if(experience >=6) {
			experiencePoints = 15;
		}else if(experience >=4) {
			experiencePoints = 13;
		}else {
			experiencePoints = 0;
		}
	}
	
	void calculateAgePoints(int age) {
		if(age >=18 && age <= 35) {
			agePoints = 12;
		}else if(age == 36) {
			agePoints = 11;
		}else if(age == 37) {
			agePoints = 10;
		}else if(age == 38) {
			agePoints = 9;
		}else if(age == 39) {
			agePoints = 8;
		}else if(age == 40) {
			agePoints = 7;
		}else if(age == 41) {
			agePoints = 6;
		}else if(age == 42) {
			agePoints = 5;
		}else if(age == 43) {
			agePoints = 4;
		}else if(age == 44) {
			agePoints = 3;
		}else if(age == 45) {
			agePoints = 2;
		}else if(age == 46) {
			agePoints = 1;
		}else if(age == 47) {
			agePoints = 0;
		}else {
			agePoints = 0;
		}
	}
	
	void calculateIeltsPoints(String ieltsModule) {
		if(ieltsModule.equals("listening")) {
			System.out.println("enter the score for listening");
			double listeningScore = sc.nextDouble();
			if(listeningScore >=8) {
				listeningPoint = 6;
			}else if(listeningScore >= 7.5) {
				listeningPoint = 5;
			}
		} 
		 if(ieltsModule.equals("speaking")) {			
			 System.out.println("enter the score for speaking");
				double speakingScore = sc.nextDouble();
			if(speakingScore>=7) {
				speakingPoint = 6;
			}else if(speakingScore >= 6.5) {
				speakingPoint = 5;
			}
		}	 
		 if(ieltsModule.equals("reading")) {
			 System.out.println("enter the score for reading");
				double readingScore = sc.nextDouble();
			if(readingScore>=7) {
				readingPoint = 6;
			}else if(readingScore >= 6.5) {
				readingPoint = 5;
			}
		}  
		 if(ieltsModule.equals("writing")) {			 
			 System.out.println("enter the score for writing");
				double writingScore = sc.nextDouble();
			if(writingScore>=7) {
				writingPoint = 6;
			}else if(writingScore >= 6.5) {
				writingPoint = 5;
			}
		} 
		 ieltsPoints = listeningPoint+speakingPoint+readingPoint+writingPoint;
	}
	
	void calculateAdaptabilityPoints() {
		int relativePoints = 0;
		System.out.println("If you have a relative in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder: yes/no");
		String isAnyRelativeInCanada = sc.next();
		if(isAnyRelativeInCanada.equals("yes")) {
			relativePoints = 5;
		}else {
			relativePoints = 0;
		}
		int studyPoints = 0;
		System.out.println("Have you studied in Canada for atleast 2 years: yes/no");
		String isStudiedInCanada = sc.next();
		if(isStudiedInCanada.equals("yes")) {
			studyPoints = 5;
		}else {
			studyPoints = 0;
		}
		int workPoints = 0;
		System.out.println("Have you worked in Canada for atleast 2 years at NOC 0, A, B : yes/no");
		String isWorkedInCanada = sc.next();
		if(isWorkedInCanada.equals("yes")) {
			workPoints = 10;
		}else {
			workPoints = 0;
		}
		
		adaptabilityPoints = relativePoints + studyPoints + workPoints;
		System.out.println("total adaptability points is "+adaptabilityPoints);
	}
	
	void calculateEligibility() {
		totalPoints = educationLevelPoints+experiencePoints+agePoints+ieltsPoints+adaptabilityPoints;
		System.out.println("Total Points you have scored: "+totalPoints);
		if(totalPoints>=67) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}else {
			System.out.println("You are not qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}
}
