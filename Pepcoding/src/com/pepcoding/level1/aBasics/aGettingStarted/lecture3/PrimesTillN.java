package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.Scanner;

public class PrimesTillN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();

		for (int i = low; i <= high; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
		scn.close();
	}

	public static boolean isPrime(int n) {

		boolean isPrime = true;
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
