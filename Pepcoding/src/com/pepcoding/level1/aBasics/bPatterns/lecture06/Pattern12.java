package com.pepcoding.level1.aBasics.bPatterns.lecture06;

import java.util.*;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(a + "\t");
				c = a+b;
				a = b;
				b = c;	
			}
			System.out.println();
		}
		
		scn.close();
	}
}
