package com.pepcoding.level1.aBasics.bPatterns.lecture06;

import java.util.*;

public class Pattern09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++)
				if(i==j || i+j==n+1)
					System.out.print("*\t");
				else
					System.out.print("\t");
			System.out.println();
		}
		
		scn.close();
	}
}
