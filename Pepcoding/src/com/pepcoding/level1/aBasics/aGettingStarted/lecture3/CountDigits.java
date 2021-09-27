package com.pepcoding.level1.aBasics.aGettingStarted.lecture3;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int digits = 1;
		while(true) {
			n=n/10;
			if(n!=0)
				digits++;
			else
				break;
		}
		System.out.println(digits);
		
		scn.close();
		
	}
}
