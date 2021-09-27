package com.pepcoding.level1.aBasics.bPatterns.lecture05;

import java.util.*;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int cst = n/2 + 1;
		
		for(int i=1; i<=(n/2)+1; i++) {
			
			for(int j=1; j<=cst;j++)
				System.out.print("*\t");
			
			for(int j=1; j<=2*i-1; j++)
				System.out.print("\t");
			
			for(int j=1; j<=cst;j++)
				System.out.print("*\t");
			
			cst--;
			System.out.println();	
		}

		int csp = n-2;
		for(int i=1; i<=n/2; i++) {
			
			for(int j=1; j<=i+1; j++)
				System.out.print("*\t");
			
			for(int j=1; j<=csp; j++)
				System.out.print("\t");
			
			for(int j=1; j<=i+1; j++)
				System.out.print("*\t");
			
			csp -= 2;
			System.out.println();
		}
		
		scn.close();
	}
}
