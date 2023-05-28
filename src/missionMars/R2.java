package missionMars;

public class R2 extends Rocket {
	int randomInt = 25;
	public R2() {
		super(120, 18, 29, 0.04, 0.08, 18);
	}

	@Override
	public boolean launch() {
		double random = Math.random()+randomInt;
		System.out.println("first random r2 "+random);
		double chanceOfExplosion = chanceOfLaunchExplosion * (getCurrentWeight() / getMaximumWeight());
		System.out.println("chanceOfExplosion r2"+chanceOfExplosion);
		return random > chanceOfExplosion;
	}

	@Override
	public boolean land() {
		double random = Math.random()+randomInt;
		System.out.println("second random r2 "+random);
		double chanceOfCrash = chanceOfLandCrash * (getCurrentWeight() / getMaximumWeight());
		System.out.println("chanceOfCrash r2"+chanceOfCrash);
		return random > chanceOfCrash;
	}
}
