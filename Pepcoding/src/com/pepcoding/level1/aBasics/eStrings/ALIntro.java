package com.pepcoding.level1.aBasics.eStrings;

import java.util.ArrayList;

public class ALIntro {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size() + "->" + list);
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size() + "->" + list);
		
		list.set(0, 200);
		System.out.println(list.size() + "->" + list);
		
		list.add(0, 2000);
		System.out.println(list.size() + "->" + list);
		
		int val = list.get(1);
		System.out.println(val);
		
		list.remove(1);
		System.out.println(list.size() + "->" + list);
		
		for(int i=0; i<list.size(); i++) {
			int value = list.get(i);
			System.out.println(value);
		}
		
		for(int value : list) {
			System.out.println(value);
		}

	}
}
