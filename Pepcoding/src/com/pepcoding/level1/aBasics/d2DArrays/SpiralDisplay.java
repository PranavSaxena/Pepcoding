package com.pepcoding.level1.aBasics.d2DArrays;

import java.util.*;

public class SpiralDisplay {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		spiralDisplay(arr);
		
		scn.close();
	}
	
	public static void spiralDisplay(int[][] arr) {
		
		int count = 1;
		int total = arr.length * arr[0].length;
		
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		
		while(count<=total) {
			
			// left wall, downwards || col fix at minc, row = minr->maxr
			for(int i=minr, j=minc; i<=maxr && count<=total; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			
			
			// bottom wall, right || row fix at maxr, col = minc->maxc
			for(int i=maxr, j=minc; j<=maxc && count<=total; j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			
			
			// right wall, upwards || col fix at maxc, row = maxr->minr
			for(int i=maxr, j=maxc; i>=minr && count<=total; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			
			
			// top wall, left || row fix at minr, col = maxc->minc
			for(int i=minr, j=maxc; j>=minc && count<=total; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
	}
}
