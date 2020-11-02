package com.set;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> a=new TreeSet<>();
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
		System.out.println(a.first());//shows the first element.
		System.out.println(a.last());//shows the last element.
		System.out.println(a.lower(5));//before the given string in accending order list
		System.out.println(a.higher(6));//after the given string in accending order list
		System.out.println(a.size());//show the size of TreeSet
		System.out.println(a.pollFirst());//it return the first element from list and remove from it
		System.out.println(a.pollLast());//it return the last element from list and remove from it
		Iterator<String> i=a.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+a.isEmpty());//it checks whether TreeSet empty or not
		System.out.println(a.contains(66));//it checks whether the String is there in TreeSet or not
		a.clear();//it clears the data
		System.out.println("\n"+ll.isEmpty());
		System.out.println(a.removeAll(a));//it clear object

	}

}
