package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String nameOfTruck;
	private String typeOfFood;
	private int rating;

	private static int nextTruckId = 1;

	private int id;

	public String toString() {

		return "Name: " + nameOfTruck + ", Food Type: " + typeOfFood + ", Rating: " + rating + ", Truck ID: " + id + "\n";

	}

	public FoodTruck() {

	}

	public FoodTruck(String nameOfTruck, String typeOfFood, int rating) {

		this.nameOfTruck = nameOfTruck;
		this.typeOfFood = typeOfFood;
		this.rating = rating;

		id = nextTruckId;
		nextTruckId++;
	}

	public String getNameOfTruck() {
		return nameOfTruck;
	}

	public void setNameOfTruck(String nameOfTruck) {
		this.nameOfTruck = nameOfTruck;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeofFood(String typeofFood) {
		this.typeOfFood = typeofFood;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTotalId() {
		int totalId = nextTruckId - 1;
		return totalId;
	}

}
