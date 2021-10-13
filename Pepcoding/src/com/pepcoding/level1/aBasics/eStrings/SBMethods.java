package com.pepcoding.level1.aBasics.eStrings;

public class SBMethods {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Leesha");
		
		sb.charAt(0);
		System.out.println(sb);
	
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.insert(0, 'H');
		System.out.println(sb);
		
		sb.toString();
		System.out.println(sb);
		
	}
}
