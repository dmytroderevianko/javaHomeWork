package com.gmail.dmytrodereviankoit;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array1 = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		System.out.println(Arrays.toString(array1));
		System.out.println("Out put odd numbers");
		for (int i = 0; i < array1.length; i++) {
			if ((array1[i] % 2) != 0) {
				System.out.print(array1[i] + " ");
			}
		}
	}
}
