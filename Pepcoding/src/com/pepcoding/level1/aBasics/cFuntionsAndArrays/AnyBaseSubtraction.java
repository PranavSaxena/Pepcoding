package com.pepcoding.level1.aBasics.cFuntionsAndArrays;

import java.util.*;

public class AnyBaseSubtraction {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = anyBaseSubtraction(b, n1, n2);
		System.out.println(d);
		scn.close();
	}

	public static int anyBaseSubtraction(int b, int n1, int n2){
		
		int dig = 0;
		int carry = 0;
		int ans = 0;
		int pow = 1;
		while(n2 > 0) {
			
			int dig1 = n1 % 10;
			int dig2 = n2 % 10;
			
			n1 /= 10;
			n2 /= 10;
			
			dig = dig2 + carry - dig1;
			
			if(dig<0) {
				dig += b;
				carry = -1;
			}
			else {
				carry = 0;
			}
			
			ans += dig*pow;
			pow *= 10;
		}
		
		return ans;
	}
}
