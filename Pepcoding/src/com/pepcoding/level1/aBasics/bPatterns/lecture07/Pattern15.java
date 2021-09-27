package com.pepcoding.level1.aBasics.bPatterns.lecture07;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nsp = n/2;
		int nsd = 1;
		int val = 0;

		for(int i=1; i<=n; i++){
			if(i>n/2+1)
				val = n-i+1;
			else
				val = i;

			for(int j=1; j<=nsp; j++) 
				System.out.print("\t");

			for(int j=1; j<=nsd; j++) {
				System.out.print(val + "\t");
				
				if(j<=nsd/2)
					val++;
				else
					val--;
			}
			if(i<=n/2) {
				nsp--;
				nsd += 2;
			}
			else {
				nsp++;
				nsd -= 2;
			}

			System.out.println();
		}

		scn.close();
	}
}
