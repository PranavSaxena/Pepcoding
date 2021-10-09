package com.pepcoding.level1.aBasics.aGettingStarted;

import java.util.*;

public class RotateNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		int rotatedNumber = rotateNumber(n,k);

		System.out.println(rotatedNumber);

		scn.close();
	}
	
	public static int rotateNumber(int n, int k) {
		int digits = numberOfDigits(n);
		int a,b,c;
		
		k = k % digits;
		if(k<0)
			k += digits;
		
		if(k==0)
			return n;
		
		a = n % (int) Math.pow(10, k);
		b = (int) Math.pow(10, digits - k);
		c  = n / (int) Math.pow(10, k);
		
		return a * b + c;
	}
	
	public static int numberOfDigits(int n) {
		int digits = 1;
		while(true) {
			n=n/10;
			if(n!=0)
				digits++;
			else
				break;
		}
		return digits;
	}

}
