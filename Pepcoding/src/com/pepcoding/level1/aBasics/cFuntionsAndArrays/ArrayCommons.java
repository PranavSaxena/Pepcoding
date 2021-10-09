package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

public class ArrayCommons {

	public static int findMax(int[] arr) {
		int max = arr[0];

		for(int i=1; i<arr.length; i++) {
			if(max<arr[i])
				max = arr[i];
		}	

		return max;
	}

	public static int findElement(int[] arr, int data) {

		int foundAt = -1;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == data) {
				foundAt = i;
				break;
			}
		}

		return foundAt;
	}
}
