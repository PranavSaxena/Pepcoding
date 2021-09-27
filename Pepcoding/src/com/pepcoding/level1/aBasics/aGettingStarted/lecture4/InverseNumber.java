package com.pepcoding.level1.aBasics.aGettingStarted.lecture4;

import java.util.*;

public class InverseNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println(inverseNumber(n));

		scn.close();
	}

	public static int inverseNumber(int n) {

		int inverse = 0;
		int place = 1;

		while(n!=0) {
			inverse += place * (int) Math.pow(10, (n%10) - 1);
			n /= 10;
			place++;
		}

		return inverse;
	}
	
}
