package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture15;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		int data = scn.nextInt();
		
		int index = binarySearch(arr, data);
		
		System.out.println(index);
		scn.close();
	}
	
	public static int binarySearch(int[] arr, int data) {
		int index = -1;
		int left = 0;
		int right = arr.length - 1;
		
		while(left<=right) {
			int mid = (left + right) / 2;
			if(arr[mid] < data)
				left = mid+1;
			else if(arr[mid] > data)
				right = mid-1;
			else {
				index = mid;
				break;
			}
		}
		return index;
	}
}
