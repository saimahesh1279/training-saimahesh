package com.list;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> a=new LinkedList<>();
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
		a.addFirst("Sai");//it add the data at first
		a.addLast("Krishna");//it add the data at last
		System.out.println(a);
		System.out.println(a.get(3));//gets the value of index
		System.out.println(a.getFirst());//gets the first value of list
		System.out.println(a.getLast());//gets the last value of list
		a.removeFirst();//removes the first element in the list
		a.removeLast();//removes the last element in the list
		a.set(4, 5);//replace of the index
		System.out.println(a);
		System.out.println(a.size());//show the size of Linkedlist
		a.remove(5);//remove the value of index
		System.out.println(a.peek());//it return the first element from list
		System.out.println(a.poll());//it return the first element from list and remove from it
		Iterator<String> i=a.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+a.isEmpty());//it checks whether Linkedlist empty or not
		System.out.println(a.contains("66"));//it checks whether the String is there in Linkedlist or not
		System.out.println(a.indexOf("70"));//It shows the index of a String
		a.clear();//it clears the data
		System.out.println("\n"+a.isEmpty());
		System.out.println(a.removeAll(a));//it clear object
	}

}
