package com.gmail.dmytroderevinkoit;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		int[] arrays1 = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter elements of array " + (i + 1));
			arrays1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arrays1));
		sc.close();

	}

}
