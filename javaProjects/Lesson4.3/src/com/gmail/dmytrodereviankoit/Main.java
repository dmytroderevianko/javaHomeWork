package com.gmail.dmytrodereviankoit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long f = 1;
		System.out.println("Input number 'n' must be 4 < n < 16");
		n = sc.nextInt();
		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				f = f * i;
				if (i < n) {
					System.out.print(i+"*");
				}else {
					System.out.print(i+"=");
				}		
			}
			System.out.println(f);
		} else {
			System.out.println("Wrong number");
		}
		sc.close();
	}
}
