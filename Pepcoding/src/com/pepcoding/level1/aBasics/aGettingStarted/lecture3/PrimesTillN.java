package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.Scanner;

public class PrimesTillN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();

		primesTillN(low, high);
		
		scn.close();
	}

	public static void primesTillN(int low, int high) {
		for (int i = low; i <= high; i++) {
			if(IsAPrime.isPrime(i))
				System.out.println(i);
		}
	}
}
