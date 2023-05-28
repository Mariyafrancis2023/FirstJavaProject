package missionMars;

public class Rocket implements SpaceShip {

	protected int rocketCost;
	protected double rocketWeight;
	protected double maximumWeight;
	protected double chanceOfLaunchExplosion;
	protected double chanceOfLandCrash;
	protected double currentWeight;

	public Rocket(int rocketCost, double rocketWeight, double maximumWeight, double chanceOfLaunchExplosion,
			double chanceOfLandCrash, double currentWeight) {
		super();
		this.rocketCost = rocketCost;
		this.rocketWeight = rocketWeight;
		this.maximumWeight = maximumWeight;
		this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
		this.chanceOfLandCrash = chanceOfLandCrash;
		this.currentWeight = rocketWeight;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		return (currentWeight + item.getWeight()) <= maximumWeight;
	}

	@Override
	public void carry(Item item) {
		currentWeight += item.getWeight();
	}

	public double getRocketWeight() {
		return rocketWeight;
	}

	public int getRocketCost() {
		return rocketCost;
	}

	public double getMaximumWeight() {
		return maximumWeight;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}
}
