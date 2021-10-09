package com.pepcoding.level1.aBasics.bPatterns;

import java.util.*;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int isp = n/2;
		int osp = -1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=isp; j++)
				System.out.print("\t");
			
			System.out.print("*\t");
			
			for(int j=1; j<=osp; j++)
				System.out.print("\t");
			
			if(i!=1 && i!=n)
				System.out.print("*\t");
				
			if(i <= n/2) {
				isp--;
				osp += 2;
			}
			else {
				isp++;
				osp -= 2;
			}
			
			System.out.println();
		}
		
		scn.close();
	}
}
