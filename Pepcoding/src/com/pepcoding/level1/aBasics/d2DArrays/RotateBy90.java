package com.pepcoding.level1.aBasics.d2DArrays;

import java.util.*;

public class RotateBy90 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[][] arr = new int[n][n];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		arr = transpose(arr);
		arr = reverseColumns(arr);
		display(arr);

		scn.close();
	}

	public static int[][] transpose(int[][] arr){

		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

	public static int[][] reverseColumns(int[][] arr){
		
		for(int i=0; i<arr.length; i++) {
			int left = 0;
			int right = arr[i].length-1;
			
			while(left<right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				left++; right--;
			}
		}
		return arr;
	}
		
	public static void display(int[][] arr){
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			
			System.out.println();
		}
	}
}
