package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> a=new Vector<>();
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
		System.out.println(a.get(3));//gets the value of index
		System.out.println(a.firstElement());//gets the first value of list
		System.out.println(a.lastElement());//gets the last value of lis
		a.set(4, 5);//replace of the index
		a.insertElementAt(55, 5);//insert in the particular index
		System.out.println(a);
		System.out.println(a.size());//show the size of Linkedlist
		a.remove(5);//remove the value of index
		Enumeration<String> i=a.elements();
		while (i.hasMoreElements()) {
			System.out.print(i.nextElement()+" ");
		}
		System.out.println("\n"+a.isEmpty());//it checks whether Linkedlist empty or not
		System.out.println(a.contains(77));//it checks whether the String is there in Linkedlist or not
		System.out.println(a.indexOf(66));//It shows the index of a String
		a.clear();//it clears the data
		System.out.println("\n"+a.isEmpty());
		System.out.println(a.removeAll(a));//it clear object
	}
}
