package com.pepcoding.level1.aBasics.eStrings;

import java.util.*;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
		scn.close();
	}

	public static String toggleCase(String str){

		StringBuilder sb = new StringBuilder(str);
		char ch;

		for(int i=0; i<str.length(); i++) {
			if(sb.charAt(i)<97)	{
				ch = (char)(sb.charAt(i)+32);
				sb.setCharAt(i, ch);
			}
			else {
				ch = (char)(sb.charAt(i)-32);
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
	}
}
