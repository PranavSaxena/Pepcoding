package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture11;

import java.util.*;

public class DecimalToAnyBase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int decimal = scn.nextInt();
		int base = scn.nextInt();
		int answer = decimalToAnyBase(decimal, base);
		System.out.println(answer);
		scn.close();
	}

	public static int decimalToAnyBase(int decimal, int base) {
		int ans = 0;
		int power = 1;

		while(decimal>0) {
			int rem = decimal % base;
			decimal /= base;
			
			ans += rem * power;
			power *= 10;
		}
		
		return ans;
	}
}
