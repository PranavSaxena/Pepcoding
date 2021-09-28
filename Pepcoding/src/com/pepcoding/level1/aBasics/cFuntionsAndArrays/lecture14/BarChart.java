package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture14;

import java.util.*;

public class BarChart {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		
		barChart(arr);
		
		scn.close();
	}
	
	public static void barChart(int[] arr) {
		int height = findMaxInArray(arr);
		
		for(int i = height; i>0; i--) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] >= i)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public static int findMaxInArray(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
