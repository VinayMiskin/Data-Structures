package com.vinay.ArrayListDS;

import java.util.ArrayList;

public class TestAL {
	public static void main(String[] args) {
		//Adding the elements and verifing object creations and new object creation when AL is is full
		MyArrayList<String> list1=new MyArrayList<>(3);
		System.out.println("The Number of elements in array? size="+list1.size());
		list1.add("a");
		list1.add("b");
		list1.add("c");
		System.out.println("2nd element is "+list1.get(2));
		System.out.println(list1);
		list1.add("d");
		System.out.println(list1);
		System.out.println("The Number of elements in array? size="+list1.size());
		
		list1.add("e");
		list1.add("f");
		System.out.println(list1);
		list1.add("g");
		list1.add("h");
		list1.add("i");
		
		//Contains(), indexOf(), Remove() method
		System.out.println("'a' exist in list? "+list1.contains("a"));
		System.out.println("'a' exist in list? "+list1.contains("1"));
		System.out.println("'a' exist in list? "+list1.indexOf("c"));
		System.out.println("'a' exist in list? "+list1.indexOf("1"));
		System.out.println("0 indexed Removed Element is "+list1.remove(0));
		System.out.println(list1);
		System.out.println("3 indexed Removed Element is "+list1.remove(3));
		System.out.println(list1);
		System.out.println("4 indexed Removed Element is "+list1.remove(4));
		System.out.println(list1);
		System.out.println("5 indexed Removed Element is "+list1.remove(5));
		System.out.println(list1);
		System.out.println("The Number of elements in array? size="+list1.size());
		
		System.out.println("3 indexed Removed Element is "+list1.remove("e"));
		System.out.println(list1);
		System.out.println("4 indexed Removed Element is "+list1.remove(4));
		System.out.println(list1);
		System.out.println("5 indexed Removed Element is "+list1.remove(2));
		System.out.println(list1);
		System.out.println("The Number of elements in array? size="+list1.size());
		
		//overloaded method add(index i, T element)
		MyArrayList<Integer> list2=new MyArrayList<>(5);
		System.out.println(list2.size());
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2.size());
		System.out.println(list2);
		System.out.println(list2.size());
		list2.add(0,4);
		System.out.println(list2.size());
		System.out.println(list2);
		list2.add(4,5);
		System.out.println(list2.size());
		System.out.println(list2);
		list2.add(4,6);
		System.out.println(list2);
		
		
	}
}
