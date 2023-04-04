package assignment2;

public class WaterTank {

	int tankCapacity = 100;
	int bucketCapacity;
	int waterInTank;
	
	void fillWaterTank() {
		
		while(waterInTank <= tankCapacity) {
			System.out.println("add water, now water is " + waterInTank);
			waterInTank+=bucketCapacity;
			
			if(waterInTank == tankCapacity) {
				System.out.println("tank is full " + waterInTank);
				break;	
				}
			}
		}
	}

