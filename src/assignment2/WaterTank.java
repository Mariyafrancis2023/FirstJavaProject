package assignment2;

public class WaterTank {

	int tankCapacity = 100;
	int bucketCapacity =10;
	int waterInTank;
	
	void fillWaterTank() {
		
		while(waterInTank <= tankCapacity) {
			System.out.println("add water, now water is " + waterInTank);
			waterInTank+=10;
			
			if(waterInTank == tankCapacity) {
				System.out.println("tank is full " + waterInTank);
				break;
			}
		}
	}
}
