package com.gmail.dmytrodereviankoit;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] array1 = new int[15];
		int[] array2 = new int[array1.length * 2];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rn.nextInt(0, 20);
		}
		array2 = Arrays.copyOf(array1, 30);
		for (int i = 0; i < array1.length; i++) {
			array2[array1.length + i] = array1[i] * 2;
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
