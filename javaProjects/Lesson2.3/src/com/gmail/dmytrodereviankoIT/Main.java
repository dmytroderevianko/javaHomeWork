package com.gmail.dmytrodereviankoIT;

public class Main {

	public static void main(String[] args) {
		double fuelCost = 1.2;
		double fuelPerKm = 8.0 / 100.0;
		double fuelPerTrip = fuelPerKm * 120;
		double tripCost = fuelPerTrip * fuelCost;
		System.out.println(tripCost + "USD");

	}

}
