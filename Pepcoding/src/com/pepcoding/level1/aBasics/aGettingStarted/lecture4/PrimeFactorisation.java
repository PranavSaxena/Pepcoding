package com.pepcoding.level1.aBasics.aGettingStarted.lecture4;

import java.util.*;

public class PrimeFactorisation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		primeFactorisation(n);
		scn.close();
	}
	
	public static void primeFactorisation(int n) {
		for(int div = 2; div*div<=n; div++) {
			while(n%div==0) {
				n=n/div;
				System.out.print(div + " ");
			}
		}
		if(n>1)
			System.out.print(n);
	}
}
