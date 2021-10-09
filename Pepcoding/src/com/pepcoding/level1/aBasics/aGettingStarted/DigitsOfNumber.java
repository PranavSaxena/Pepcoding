package com.pepcoding.level1.aBasics.aGettingStarted;

import java.util.*;

public class DigitsOfNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		digitsOfNumber(n);

		scn.close();
	}
	
	public static void digitsOfNumber(int n) {
		int digit;
		int nod = CountDigits.countDigits(n);

		for(int i = 1; i<=nod; i++) {
			digit = (int) (n/Math.pow(10, nod-i));
			System.out.println(digit);
			n = (int) (n % Math.pow(10, nod-i));
		}
		
	}
}
