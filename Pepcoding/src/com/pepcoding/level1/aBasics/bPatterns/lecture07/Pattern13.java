package com.pepcoding.level1.aBasics.bPatterns.lecture07;

import java.util.*;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i=0; i<=n-1; i++) {
			
			for(int j=0; j<=i; j++)
				System.out.print(coEfficient(i,j) + "\t");
				
			System.out.println();
		}
		
		scn.close();
	}
	
	public static int coEfficient(int n, int k) {
		int a = fact(n);
		int b = fact(k);
		int c = fact(n-k);
		
		return a/(b*c);
	}

	public static int fact(int f) {
		int fact = 1;
		
		for(int i=f; i>=1; i--)
			fact *= i;
		
		return fact;
	}
}
