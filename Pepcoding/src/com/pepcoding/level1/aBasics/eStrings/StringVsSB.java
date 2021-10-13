package com.pepcoding.level1.aBasics.eStrings;

public class StringVsSB {
	public static void main(String[] args) {
		
		// STRING
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0; i<100000; i++)
			s += i;
		
		long end = System.currentTimeMillis();
		long durationForString = end - start;
		System.out.println("Time for String: " + durationForString + "ms");
		
		// STRING BUILDER
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<100000; i++)
			sb.append(i);
		
		end = System.currentTimeMillis();
		long durationForSB = end - start;
		System.out.println("Time for SB: " + durationForSB + "ms");

	}
}
