package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
			arr[i] = scn.nextInt();
		int element = scn.nextInt();
		
		int index = binarySearch(arr, element);
		
		System.out.println(index);
		scn.close();
	}
	
	public static int binarySearch(int[] arr, int element) {

		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
		
			if(element < arr[mid]) {
				high = mid - 1;
			}
			else if(element > arr[mid]) {
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
}
