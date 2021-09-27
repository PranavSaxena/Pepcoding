package com.pepcoding.level1.aBasics.bPatterns.lecture06;

import java.util.*;

public class Pattern08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print("\t");
			System.out.println("*");
		}
		
		scn.close();
	}
}
