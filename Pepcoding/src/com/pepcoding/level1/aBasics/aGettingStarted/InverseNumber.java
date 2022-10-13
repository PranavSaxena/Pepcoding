package com.pepcoding.level1.aBasics.aGettingStarted;

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
		int i = 1;

		while(n>0) {
			inverse += i++ * (int) Math.pow(10, (n%10)-1);
			n /= 10;
		}
		return inverse;
	}

}
