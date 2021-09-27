package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture11;

import java.util.*;

public class AnyBaseToDecimal {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int d = anyBaseToDecimal(n, b);
		System.out.println(d);
		scn.close();
	}

	public static int anyBaseToDecimal(int n, int b) {
		int ans = 0;
		int pow = 1;
		while(n>0) {
			int rem = n % 10;
			ans += rem * pow;
			pow *= b;
			n /= 10;
		}
		
		return ans;
	}
}
