package com.pepcoding.level1.aBasics.cFuntionsAndArrays.lecture12;

import java.util.*;

public class AnyBaseAddition {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getSum(b, n1, n2);
		System.out.println(d);

		scn.close();
	}

	public static int getSum(int b, int n1, int n2){

		int sum = 0;
		int carry = 0;
		int pow = 1;
		
		while(n1>0 || n2>0 || carry>0) {
			int dig1 = n1 % 10;
			int dig2 = n2 % 10;
			
			n1 /= 10;
			n2 /= 10;
			
			int dig = dig1 + dig2 + carry;
			carry = dig / b;
			dig = dig % b;
			
			sum += dig * pow;
			pow *= 10;
		}
		
		return sum;
	}
}
