package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class FirstIndexLastIndex {

public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		
		int firstIndex = firstIndex(arr, d);
		int lastIndex = lastIndex(arr, d);
		
		System.out.println(firstIndex);
		System.out.println(lastIndex);
		
		scn.close();
	}
	
	public static int firstIndex(int[] arr, int d) {
		
		int fi = -1;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(d<arr[mid]) {
				high = mid-1;
			}
			else if(d>arr[mid]) {
				low = mid+1;
			}
			else {
				fi = mid;
				high = mid-1;
			}
		}
		
		return fi;
	}
	
	public static int lastIndex(int[] arr, int d) {
		
		int li = -1;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(d<arr[mid]) {
				high = mid-1;
			}
			else if(d>arr[mid]) {
				low = mid+1;
			}
			else {
				li = mid;
				low = mid+1;
			}
		}
		
		return li;
	}
		
}
