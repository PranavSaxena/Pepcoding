package com.pepcoding.level1.aBasics.bPatterns.lecture05;

import java.util.*;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scn.close();
	}
}
