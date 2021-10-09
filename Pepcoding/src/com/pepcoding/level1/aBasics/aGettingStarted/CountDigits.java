package com.pepcoding.level1.aBasics.aGettingStarted;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int digits = countDigits(n);

		System.out.println(digits);
		scn.close();
		
	}
	
	public static int countDigits(int n) {
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
