package com.pepcoding.level1.aBasics.aGettingStarted.lecture4;

import java.util.*;

public class PythagoreanTriplet {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		System.out.println(isPythagoreanTriplet(a, b, c));
		
		scn.close();
	}
	
	public static boolean isPythagoreanTriplet(int a, int b, int c) {
		int max = greatestNumber(a, b, c);
		
		if(max==a) {
			return checkPythagorean(max, b, c);
		}
		else if(max==b) {
			return checkPythagorean(max, a, c); 
		}
		else
			return checkPythagorean(max, b, a);
	}
	
	public static int greatestNumber(int a, int b, int c) {
		int t = (a > b) ? a:b; 
		return t > c ? t:c;
			
	}
	
	public static boolean checkPythagorean(int max, int y, int z) {
		return max*max == (y*y + z*z);
	}

}
