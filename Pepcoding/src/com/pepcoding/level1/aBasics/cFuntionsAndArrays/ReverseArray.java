package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.io.*;

public class ReverseArray{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(br.readLine());
		}

		reverseArray(a);
		display(a);
	}

	public static void reverseArray(int[] arr){
		int i = 0;
		int j = arr.length - 1;
		
		while(i<j) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];

			i++; j--;
		}
	}
	
	public static void display(int[] a){
		StringBuilder sb = new StringBuilder();

		for(int val: a){
			sb.append(val + " ");
		}
		System.out.println(sb);
	}


}
