package com.gmail.dmytrodereviankoit;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int number4;
		int largestNumber;
		System.out.println("Input first number");
		number1 = sc.nextInt();
		System.out.println("Input second number");
		number2 = sc.nextInt();
		System.out.println("input third number");
		number3 = sc.nextInt();
		System.out.println("Input fourth number");
		number4 = sc.nextInt();
		largestNumber = number1;
		if (number2 > number1) {
			largestNumber = number2;
		}if (number3 > number2) {
			largestNumber =number3;
		}if (number4 > number3) {
			largestNumber = number4;
		}
		System.out.println( largestNumber + " LargestNumber");
				}
	}
