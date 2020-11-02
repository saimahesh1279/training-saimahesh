package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> a=new PriorityQueue<>();
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
		System.out.println(a);
		System.out.println(a.size());//show the size of PriorityQueue
		a.remove(5);//remove the value of index
		System.out.println(a.peek());//it return the first element from list
		System.out.println(a.poll());//it return the first element from list and remove from it
		Iterator<String> i=a.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+a.isEmpty());//it checks whether PriorityQueue empty or not
		System.out.println(a.contains(66));//it checks whether the String is there in PriorityQueue or not
		a.clear();//it clears the data
		System.out.println("\n"+a.isEmpty());
		System.out.println(a.removeAll(a));//it clear object
	}

}
