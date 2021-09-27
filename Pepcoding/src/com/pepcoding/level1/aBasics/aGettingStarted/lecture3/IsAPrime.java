package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.*;

public class IsAPrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int i = 1; i<=t; i++) {
			int n = scn.nextInt();

			boolean isPrime = true;
			for(int j = 2; j*j <= n; j++) {
				if(n%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
		scn.close();
	}

}
