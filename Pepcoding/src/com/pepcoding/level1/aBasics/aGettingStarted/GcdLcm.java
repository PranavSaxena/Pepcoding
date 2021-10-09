package com.pepcoding.level1.aBasics.aGettingStarted;

import java.util.*;

public class GcdLcm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int gcd = gcd(n1,n2);
		int lcm = lcm(n1,n2,gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		scn.close();
	}

	public static int lcm(int n1, int n2, int gcd) {
		return (n1*n2)/gcd;
	}

	public static int gcd(int n1, int n2) {
		while(n1%n2!=0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		return n2;
	}
}
