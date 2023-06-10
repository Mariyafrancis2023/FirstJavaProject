package missionMars;

public class R1 extends Rocket {
	
	int randomInt = 25;
	public R1() {
		super(100, 10, 18, 0.05, 0.01, 10);
	}

	@Override
	public boolean launch() {
	//	int randomInt = (int) Math.random();
	//	int randomInt = 25;
		double random = Math.random()+randomInt;
	//	System.out.println("first random r1"+random);
		double chanceOfExplosion = chanceOfLaunchExplosion * (getCurrentWeight() / getMaximumWeight());
	//	System.out.println("chanceOfExplosion r1 "+chanceOfExplosion);
		return random > chanceOfExplosion;
	}

	@Override
	public boolean land() {
//		double random = Math.random();
//		int randomInt = 10;
		double random = Math.random()+randomInt;
		System.out.println("second random "+random);
		double chanceOfCrash = chanceOfLandCrash * (getCurrentWeight() / getMaximumWeight());
		System.out.println("chanceOfCrash r1"+chanceOfCrash);
		return random > chanceOfCrash;
	}
}
