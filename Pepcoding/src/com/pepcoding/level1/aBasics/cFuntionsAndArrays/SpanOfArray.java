package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.Scanner;

public class SpanOfArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		int span = spanOfArray(arr);
	
		System.out.println(span);
		scn.close();
	}
	
	public static int spanOfArray(int arr[]) {
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		
		return max-min;
	}
}
