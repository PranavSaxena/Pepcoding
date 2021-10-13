package com.pepcoding.level1.aBasics.d2DArrays;

import java.util.*;

public class DiagnolDisplay {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[][] arr = new int[n][n];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		diagnolDisplay(arr);
		
		scn.close();
	}

	public static void diagnolDisplay(int[][] arr) {
		
		for(int col=0; col<arr[0].length; col++) {		
			for(int i=0, j=col; j<arr[0].length; i++,j++)
				System.out.println(arr[i][j]);
		}
	}
}
