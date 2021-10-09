package com.pepcoding.level1.aBasics.bPatterns;

import java.util.*;

public class Pattern05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=1; i<=(n/2)+1; i++) {
			
			for(int j=1; j<=(n/2)-i+1; j++)
				System.out.print("\t");

			for(int j=1; j<=(2*i)-1; j++)
				System.out.print("*\t");
			
			System.out.println();
		}
		
		for(int i=1; i<=n/2; i++) {
			
			for(int j=1; j<=i; j++)
				System.out.print("\t");

			for(int j=1; j<=n-(2*i); j++)
				System.out.print("*\t");
			
			System.out.println();
		}
		
		scn.close();
	}
}
