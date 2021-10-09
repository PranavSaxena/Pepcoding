package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++)
			arr[i] = scn.nextInt();
		int k = scn.nextInt();
		
		int[] rotatedArray = rotateArray(arr, k);
		
		for(int i=0; i<rotatedArray.length; i++)
			System.out.print(arr[i] + " ");
		
		scn.close();
	}
	
	public static int[] rotateArray(int[] arr, int k) {
		
		k %= arr.length;
		if(k<0)
			k+= arr.length;
		
		reverseArray(arr,0,arr.length-k-1);
		reverseArray(arr, arr.length-k, arr.length-1);
		reverseArray(arr, 0, arr.length-1);
		
		return arr;
	}
	
	public static void reverseArray(int[] arr, int i, int j){
		
		while(i<j) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];

			i++; j--;
		}
	}

}
