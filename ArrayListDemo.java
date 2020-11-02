package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
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
		a.set(4, "Srinivas");//replace of the index
		System.out.println(a);
		System.out.println(a.size());//show the size of arraylist
		a.remove(5);//remove the value of index
		Iterator<String> i=a.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+a.isEmpty());//it checks whether arraylist empty or not
		System.out.println(a.contains(66));//it checks whether the String is there in arraylist or not
		System.out.println(a.indexOf(99));//It shows the index of a String
		a.clear();//it clears the data
		System.out.println("\n"+a.isEmpty());
		System.out.println(a.removeAll(a));//it clear object
	}

}
