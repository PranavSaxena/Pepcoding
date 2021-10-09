package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class BrokenEconomy {
public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		
		int floor = -1;
		int ceil = -1;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(d<arr[mid]) {
				ceil = arr[mid];
				high = mid-1;
			}
			else if(d>arr[mid]) {
				floor = arr[mid];
				low = mid+1;
			}
			else {
				floor = arr[mid];
				ceil = arr[mid];
				break;
			}
		}
		
		System.out.println(ceil);
		System.out.println(floor);
		
		scn.close(); }}
