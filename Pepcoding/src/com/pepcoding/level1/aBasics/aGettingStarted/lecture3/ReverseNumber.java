package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int original = scn.nextInt();
		
		int reversed = 0;
		int n = original;
	
		while(n!=0) {
			reversed = reversed*10 + n%10;
			n = n/10;
		}
		
		System.out.println(reversed);
		scn.close();
	}
}
