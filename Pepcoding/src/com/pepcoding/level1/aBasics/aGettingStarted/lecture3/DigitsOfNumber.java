package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.*;

public class DigitsOfNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nod = numberOfDigits(n);
		
		int digit;
		for(int i = 1; i<=nod; i++) {
			digit = (int) (n/Math.pow(10, nod-i));
			System.out.println(digit);
			n = (int) (n % Math.pow(10, nod-i));
		}
		
		scn.close();
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
