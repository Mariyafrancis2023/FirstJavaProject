package learnStatements;

public class Drivinglicense {

		int age;
		//String currentLicense;
		boolean isLevelG1;
		boolean isLevelG2;
		
		void typeOfLicence() {
			if(age>=17 && isLevelG1) 
			{
				System.out.println("eligible for G2");
			}
			else if(age>=18 && isLevelG2) 
			{
				System.out.println("eligible for G");
			}
			else if(age>=16) 
			{
				System.out.println("eligible for G1");	
			}
			else 
			{
				System.out.println("not eligible");
			}
		}
		}

