package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class SumOfArrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int[] one = new int[n1];
		for (int i = 0; i < one.length; i++)
			one[i] = scn.nextInt();
		
		int n2 = scn.nextInt();
		int[] two = new int[n2];
		for (int i = 0; i < two.length; i++)
			two[i] = scn.nextInt();

		int carry = 0;
		int[] sum = sumOfArray(one, two, carry);
		
		if(carry!=0)
			System.out.println(carry);
		
		for (int i = 0; i < sum.length; i++)
			System.out.println(sum[i]);
		
		scn.close();
	}
	
	public static int[] sumOfArray(int[] one, int[] two, int carry) {
		int[] sum = new int[one.length > two.length ? one.length : two.length];
		
		int i = one.length - 1;
		int j = two.length - 1;
		int k = sum.length - 1;
		int digit = 0;
		
		while(k>=0) {
			digit = carry;
			
			if(i>=0)
				digit += one[i];
			if(j>=0)
				digit += two[j];
			
			carry = digit / 10;
			digit %= 10;
			
			sum[k] = digit;
			
			i--; j--; k--;
		}
		
		return sum;
	}
}
