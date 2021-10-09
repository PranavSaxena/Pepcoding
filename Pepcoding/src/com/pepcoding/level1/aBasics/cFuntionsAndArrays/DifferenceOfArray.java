package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class DifferenceOfArray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++)
			arr1[i] = scn.nextInt();

		int n2 = scn.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++)
			arr2[i] = scn.nextInt();
		
		int[] diff = getDifference(arr1, arr2);
		
		int i=0;
		while(diff[i]==0)
			i++;
		
		for(int j=i; j<diff.length; j++) {
			System.out.println(diff[j]);
		}
		
		scn.close();
	}
	
	public static int[] getDifference(int[] arr1, int[] arr2) {
		
		int[] diff = new int[arr2.length];
		int carry = 0;
		
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = diff.length-1;
		
		while(k>=0){
			
			int dig = arr2[j] + carry;
			
			if(i>=0)
				dig = dig - arr1[i];
			
			if(dig<0) {
				carry = -1;
				dig += 10;
			}
			else {
				carry = 0;
			}
			diff[k] = dig;
			i--; j--; k--;
		}
		return diff;
	}
}
