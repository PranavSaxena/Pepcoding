package com.pepcoding.level1.aBasics.bPatterns;

import java.util.*;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nsp = 2*n-3;
		int nsd = 1;
		int val = 0;
		
		for(int i=1; i<=n; i++) {
			val = 1;
			
			for(int j=1; j<=nsd; j++)
				System.out.print(val++ + "\t");
			
			for(int j=1; j<=nsp; j++)
				System.out.print("\t");
			
			val = i;
			if(i==n) {
				nsd--;
				val--;
			}
							
			for(int j=1; j<=nsd; j++) {
				System.out.print(val-- + "\t");
			}
			nsp -= 2;
			nsd++;
			System.out.println();
		}
		
		scn.close();
	}

}
