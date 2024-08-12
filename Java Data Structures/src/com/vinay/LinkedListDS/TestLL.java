package com.vinay.LinkedListDS;

import java.util.LinkedList;

public class TestLL {
	public static void main(String[] args) {
		MySinglyLinkedList<String> l=new MySinglyLinkedList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		System.out.println(l.size());
		l.add("d");
		l.add("e");
		System.out.println(l.size());
		l.add("f");
		l.add("g");
		System.out.println(l.size());
		System.out.println(l);
		l.add(5,"H5");
		System.out.println(l);
		l.add(0,"H0");
		System.out.println(l);
		l.add(7,"H7");
		System.out.println(l);
		l.add(9,"H9");
		
		System.out.println(l.size());
		System.out.println(l);
		System.out.println("g? "+l.contains("g"));
		System.out.println("Posi element is "+l.get(2));
		System.out.println("Posi element is "+l.get(5));
		
		MySinglyLinkedList<Integer> l2=new MySinglyLinkedList<>();
		l2.add(1);
		l2.add(2);
		System.out.println(l2);
		l2.add(0,22);
		l2.add(2,33);
		System.out.println(l2);
		System.out.println("Posi element is "+l2.get(0));
		System.out.println("Posi element is "+l2.get(2));
		
		System.out.println();
		System.out.println(l2.remove(2));
		System.out.println(l2);
		System.out.println(l2.remove(33));
		System.out.println(l2);
		System.out.println(l2.remove(22));
		System.out.println(l2);
		System.out.println(l2.remove(1));
		System.out.println(l2);
		
	}	
}
