package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture15;

import java.util.*;

public class InverseArray {
	public static void main(String[] args) throws Exception {
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		int[] inv = inverse(arr);
	
		for(int i = 0; i<inv.length; i++)
			System.out.print(inv[i] + " ");
	
		scn.close();
	}
	
	public static int[] inverse(int[] arr){
		int[] inv = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++)
			inv[arr[i]] = i;

		return inv;
	}

}
