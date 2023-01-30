package com.gmail.dmytrodereviankoit;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Input side A");
		a = sc.nextInt();
		int b;
		System.out.println("Input side B");
		b = sc.nextInt();
		int c;
		System.out.println("Input side C");
		c = sc.nextInt();
		if (((a + c) > b) && ((b + c) > a) && ((a + b) > c)) {
			System.out.println("This triangle exist");
		} else {
			System.out.println("This triangle don`t exist");
		}
		sc.close();
	}

}
