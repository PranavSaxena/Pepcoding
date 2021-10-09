package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++)
			arr[i] = scn.nextInt();
		
		int rows = (int) Math.pow(2, n);
		
		for(int i = 1; i<=rows; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<n; k++) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
			
		}
		
		scn.close();
	}
}
