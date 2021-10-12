package com.pepcoding.level1.aBasics.d2DArrays;

import java.util.*;

public class ExitPoint {
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
		
		exitPoint(arr);
		
		scn.close();
		
	}
	
	public static void exitPoint(int[][] arr) {
		int i = 0;
		int j = 0;
		int dir = 0; 			//	0 - E || 1 - S || 2 - W || 3 - N
		while(true) {
			dir = (dir + arr[i][j]) % 4;
			
			if(dir==0) {
				j++;
				if(j>arr[0].length-1) {
					j--;					//  E A S T   W A L L
					break;
				}
			}
			else if(dir==1) {
				i++;
				if(i>arr.length-1) {		//  S O U T H   W A L L
					i--;
					break;
				}
			}
			else if(dir==2) {
				j--;
				if(j<0) {					//  W E S T   W A L L
					j++;
					break;
				}
			}
			else if(dir==3) {
				i--;
				if(i<0) {					//  N O R T H   W A L L
					i++;
					break;
				}
			}
		}
		
		System.out.println(i);
		System.out.println(j);
	}
}
