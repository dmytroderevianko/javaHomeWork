package com.gmail.dmytrodereviankoit;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flatNumber;
		System.out.println("Input flat number");
		flatNumber = sc.nextInt();
		if (flatNumber >= 1 && flatNumber <= 180) {
		int entrance = (flatNumber - 1) / 36 + 1;
		System.out.println("Entrance number " + entrance);
		int floor = (flatNumber -36 * (entrance -1) - 1) /4 +1;
		System.out.println("Floor number " + floor);
		}
	}

}
