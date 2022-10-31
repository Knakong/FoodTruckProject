package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FoodTruckApp app1 = new FoodTruckApp();

		final int MAX_AMOUNT_OF_TRUCKS = 5;

		FoodTruck[] listOfTrucks = new FoodTruck[MAX_AMOUNT_OF_TRUCKS];
		
		System.out.println("Welcome to Food Truck App\n");
		
		for (int i = 0; i < listOfTrucks.length; i++) {
			System.out.println("Name of Food Truck: ");

			String name = sc.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.println("Type of Food: ");

			String type = sc.nextLine();

			if (type.equalsIgnoreCase("quit")) {
				break;

			}

			System.out.println("Rate between (Worst) 1 - 5 (best) ");

			String strRating = sc.nextLine();

			if (strRating.equalsIgnoreCase("quit")) {
				break;
			}

			int rating = Integer.parseInt(strRating);

			listOfTrucks[i] = new FoodTruck(name, type, rating);

		}

		boolean isOn = true;

		while (isOn) {
			System.out.println("1. See All Food Trucks");
			System.out.println("2. See the average rating of food trucks");
			System.out.println("3. Display the Highest-Rated Food Truck");
			System.out.println("4. Quit the program");

			int x = sc.nextInt();

			switch (x) {

			case 1:
				app1.listOfTrucks(listOfTrucks);
				break;
			case 2:
				app1.averageRating(listOfTrucks);
				break;
			case 3:
				app1.highestRated(listOfTrucks);
				break;
			case 4:
				System.out.println("Goodbye!");
				isOn = false;

			}
		}

		sc.close();
	}

	public void listOfTrucks(FoodTruck[] trucks) {
		for (int x = 0; x < trucks.length; x++) {
			if (trucks[x] != null) {
				System.out.println(trucks[x]);

			}

		}
	}

	public void highestRated(FoodTruck[] trucks) {

		int max = 0;
		int i = 0;

		for (int x = 0; x < trucks.length; x++) {

			if (trucks[x] != null) {

				if (max < trucks[x].getRating()) {
					max = trucks[x].getRating();

					i = x;

				}

			}

		}
		System.out.println(trucks[i]);

	}

	public void averageRating(FoodTruck[] trucks) {
		
		int sumOfRating = 0;
		for (int x = 0; x < trucks.length; x++) {
			if (trucks[x] != null) {
				sumOfRating += trucks[x].getRating();
			}

		}
		double averageRating = (int) ((double)sumOfRating) / ((double)(trucks[0].getTotalId()));

		System.out.println("Number of Trucks " + trucks[0].getTotalId());

		System.out.println("Average Rating " + averageRating);

	}

}