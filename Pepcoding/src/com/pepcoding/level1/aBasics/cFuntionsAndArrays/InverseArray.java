package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class InverseArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = scn.nextInt();
		
		int[] inv = inverseArray(arr);
		
		for(int i = 0; i<n; i++)
			System.out.print(inv[i] + " ");
		
		scn.close();
	}
	
	public static int[] inverseArray(int[] arr) {
		int[] inv = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++)
			inv[arr[i]] = i;
		
		return inv;
	}
}
