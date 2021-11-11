package com.pepcoding.level1.aBasics.eStrings;

import java.util.ArrayList;
import java.util.Scanner;

import com.pepcoding.level1.aBasics.aGettingStarted.IsAPrime;

public class RemovePrimes {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			list.add(scn.nextInt());
		}
		
		list = removePrimes(list);
		System.out.println(list);
		scn.close();
	}
	
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> list){
		
		for(int i = 0; i<list.size(); i++) {
			if(IsAPrime.isPrime(list.get(i))) {
				list.remove(i--);
			}
		}
		
		return list;	
	}
	
}
