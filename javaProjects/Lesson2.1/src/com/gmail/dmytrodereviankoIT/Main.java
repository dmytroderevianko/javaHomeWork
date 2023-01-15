package com.gmail.dmytrodereviankoIT;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double ph = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(ph * (ph - sideA) * (ph - sideB) * (ph - sideC));
		System.out.println(area);

	}

}
