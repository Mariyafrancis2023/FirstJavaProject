package missionMars;

import java.util.ArrayList;

public class SimulationMain {

	public static void main(String[] args) {

		Simulation simulation = new Simulation();
		try {
			ArrayList<Item> items = simulation.loadItems("Phase1.txt");

			ArrayList<Rocket> r1Rocket = simulation.loadU1(items);
			int r1TotalBudget = simulation.runSimulation(r1Rocket);
			System.out.println("total cost for R1: " + r1TotalBudget);

			ArrayList<Rocket> r2Rocket = simulation.loadU2(items);
			int r2TotalBudget = simulation.runSimulation(r2Rocket);
			System.out.println("total cost for R2: " + r2TotalBudget);
		} catch (Exception e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
	}
}
