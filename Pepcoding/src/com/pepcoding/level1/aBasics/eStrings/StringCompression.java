package com.pepcoding.level1.aBasics.eStrings;

import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		scn.close();
	}

	public static String compression1(String str){

		String newStr = "";
		for(int i=0; i<str.length()-1; 	i++) {
			if(str.charAt(i) == str.charAt(i+1))
				continue;
			else
				newStr += str.charAt(i);
		}
		newStr += str.charAt(str.length()-1);
		return newStr;
	}

	public static String compression2(String str){
		String newStr = "";
		int count = 1;
		for(int i=0; i<str.length() - 1; i++) {
			if(str.charAt(i) == str.charAt(i + 1))
				count++;
			else {
				newStr += str.charAt(i);
				if(count>1) {
					newStr += count;
					count = 1;
				}
			}
		}

		newStr += str.charAt(str.length()-1);
		if(count>1)
			newStr += count;

		return newStr;
	}
}