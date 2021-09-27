package com.pepcoding.level1.aBasics.bPatterns.lecture07;

import java.util.*;

public class Pattern17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int nst = 1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n/2; j++)
				if(i==n/2+1)
					System.out.print("*\t");
				else
					System.out.print("\t");
			for(int j=1; j<=nst; j++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2)
				nst++;
			else
				nst--;
			
			System.out.println();
		}
		
		scn.close();
	}

}
