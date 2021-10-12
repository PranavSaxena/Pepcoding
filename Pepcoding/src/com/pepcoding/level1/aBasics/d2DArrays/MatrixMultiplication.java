package com.pepcoding.level1.aBasics.d2DArrays;

import java.util.*;

public class MatrixMultiplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int m1 = scn.nextInt();
		
		int[][] arr1 = new int[n1][m1];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				arr1[i][j] = scn.nextInt();
			}
		}
		
		
		int n2 = scn.nextInt();
		int m2 = scn.nextInt();
		
		int[][] arr2 = new int[n2][m2];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				arr2[i][j] = scn.nextInt();
			}
		}
			
		if(m1 != n2){
            System.out.println("Invalid input");
            return;
        }
        
		int[][] prod = matrixMultiply(arr1, arr2);
		
		for(int i=0; i<prod.length; i++) {
			for(int j=0; j<prod[0].length; j++) {
				System.out.print(prod[i][j] + " ");
			}
			System.out.println();
		}
		
		scn.close();
		
	}

	public static int[][] matrixMultiply(int[][] arr1, int[][] arr2){
		
		int[][] prod = new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<prod.length; i++) {
			for(int j=0; j<prod[0].length; j++) {
				
				for(int k = 0; k<arr2.length; k++)
					prod[i][j] += arr1[i][k] * arr2[k][j];
			}
		}
		
		return prod;
		
	}
	
}
