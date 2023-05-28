package missionMars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Simulation {

	public ArrayList<Item> loadItems(String fileName) throws NumberFormatException, IOException {
		ArrayList<Item> items = new ArrayList<>();
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader br = new BufferedReader(file);
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split("=");
				String name = parts[0];
				int weight = Integer.parseInt(parts[1]);
				Item item = new Item(name, weight);
				items.add(item);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		}
		return items;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R1 rocket = new R1();
		for (Item item : items) {
			if (!rocket.canCarry(item)) {
				rockets.add(rocket);
				rocket = new R1();
			}
			rocket.carry(item);
		}
		rockets.add(rocket);
		return rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R2 rocket = new R2();
		for (Item item : items) {
			if (!rocket.canCarry(item)) {
				rockets.add(rocket);
				rocket = new R2();
			}
			rocket.carry(item);
		}
		rockets.add(rocket);
		return rockets;
	}

	public int runSimulation(ArrayList<Rocket> rockets) {
		int totalBudget = 0;
		for (Rocket rocket : rockets) {
			totalBudget += rocket.getRocketCost();
			while (!rocket.land() || !rocket.launch()) {
				totalBudget += rocket.getRocketCost();
			}
		}
		return totalBudget;
	}
}
