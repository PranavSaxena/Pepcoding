package com.pepcoding.level1.aBasics.aGettingStarted;

import java.util.*;

public class BenjaminBumbs {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 1; i*i<=n; i++) {
			System.out.println(i*i);
		}
		scn.close();
	}
}
