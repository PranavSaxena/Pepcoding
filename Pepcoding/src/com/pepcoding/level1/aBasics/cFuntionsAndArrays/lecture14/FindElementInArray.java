package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture14;

import java.util.*;

public class FindElementInArray {
	public static void main(String[] args) {
		
		Scanner scn =  new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		
		int data = scn.nextInt();
		
		int foundAt = findElement(arr, data);
		
		System.out.println(foundAt);
		scn.close();
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
