package com.pepcoding.level1.aBasics.eStrings;

import java.util.Scanner;

public class DifferenceOfChars {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		System.out.println(differenceOfChars(str));
		
		scn.close();
	}

	public static String differenceOfChars(String str){
	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			if(i == str.length()-1) {
				sb.append(str.charAt(i));
			}
			else {
				char chi = str.charAt(i);
				char chip1 = str.charAt(i+1);
				sb.append(chi);
				sb.append(chip1 - chi);
			}
		}
		
		return sb.toString();
	}

}
