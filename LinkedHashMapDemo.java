package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> a = new LinkedHashMap<>();
		 a.add(2);
     a.add(6);
     a.add(23);
     a.add(36);
     a.add(8);
     a.add(1);
     a.add(6);
     a.add(7);
     a.add(66);
     a.add(99);
     a.add(25);
     a.add(26);
     a.add(55);
     a.add(11);
     a.add(65);
     a.add(89);
     a.add(79);
     a.add(60); 
		System.out.println(a);
		System.out.println(a.size());//show the size of HashMap
		System.out.println("\n"+a.isEmpty());//it checks whether HashMap empty or not
		System.out.println(a.containsKey(2));//it checks whether key present or not
		System.out.println(a.containsValue(66));//it checks whether Value present or not
		hm.replace(4, 8, 56);//Replace the value
		System.out.println(a);
		a.clear();//it clears the data
	}
}
