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
		
		ReverseArray.reverseArray(arr);
		
		return arr;
	}
}
