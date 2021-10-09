package com.pepcoding.level1.aBasics.bPatterns;

import java.util.*;

public class Pattern20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for(int i=1; i<=n; i++) {

			for(int j=1; j<=n; j++) {
				
				if(i<=n/2){
					if(j==1 || j==n)
						System.out.print("*\t");
					else
						System.out.print("\t");	
				}
				else {
					if(j==i || j+i==n+1 || j==1 || j==n)
						System.out.print("*\t");
					else
						System.out.print("\t");
				}
			}
			
			System.out.println();
		}

		scn.close();
	}

}
