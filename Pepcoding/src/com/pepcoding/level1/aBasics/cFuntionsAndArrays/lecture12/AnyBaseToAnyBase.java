package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture12;

import java.util.*;

public class AnyBaseToAnyBase {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b1 = scn.nextInt();
		int b2 = scn.nextInt();
		int decimal = anyBaseToDecimal(n,b1);
		int converted = decimalToAnyBase(decimal,b2);
		System.out.println(converted);
		scn.close();
	}

	public static int decimalToAnyBase(int n, int b) {
		int ans = 0;
		int pow = 1;
		
		while(n>0) {
			int dig = n % b;
			n /= b;
			
			ans += dig * pow;
			pow *= 10;
		}
		
		return ans;
	}

	public static int anyBaseToDecimal(int n, int b) {
		int ans = 0;
		int pow = 1;
		
		while(n>0) {
			int dig = n % 10;
			n /= 10;
			
			ans += dig * pow;
			pow *= b;
		}
		
		return ans;
	}

}
