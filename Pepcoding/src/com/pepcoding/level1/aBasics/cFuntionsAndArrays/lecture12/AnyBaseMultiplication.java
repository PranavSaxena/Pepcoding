package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture12;

import java.util.*;

public class AnyBaseMultiplication {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = anyBaseMultiplication(b, n1, n2);
		System.out.println(d);
		scn.close();
	}

	public static int anyBaseMultiplication(int b, int n1, int n2) {
		int ans = 0;
		int pow1 = 1;
		int carry = 0;
		
		while(n2>0 || carry>0) {
			int temp = n1;
			int dig1 = n2 % 10;
			int tempAns = 0;
			carry = 0;
			int val = 0;
			int pow2 = 1;
		
			while(temp>0 || carry>0) {
				int dig2 = temp % 10;
				
				val = (dig1 * dig2 + carry) % b;
				carry = (dig1 * dig2 + carry) / b;
				
				tempAns += val * pow2;
				temp /= 10;
				pow2 *= 10;
			}
			
			ans = AnyBaseAddition.anyBaseAddition(b, ans, tempAns*pow1);
			pow1 *= 10;
			n2 /= 10;
		}

		return ans;
	}
}
