package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.*;

public class IsAPrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		boolean isPrime = isPrime(n);
		System.out.println(isPrime);

		scn.close();
	}

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for(int j = 2; j*j <= n; j++) {
			if(n%j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
