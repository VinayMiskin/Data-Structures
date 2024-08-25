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
		
		l.add(5,"H5");
		
		l.add(0,"H0");
		
		l.add(7,"H7");
		
		l.add(9,"H9");
		System.out.println(l);
		String s = "g";
		System.out.println(s+" index is "+l.indexOf(s));
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

		
		System.out.println(l2);
		System.out.println("Index of element 2 is "+l2.indexOf(2));
		System.out.println("remove 3rd indexed element "+l2.remove(3));
		System.out.println(l2);
		
		
		
		MyDoublyLinkedList<String> l3 = new MyDoublyLinkedList<>();
		l3.add("a");
		System.out.println(l3.size());
		System.out.println(l3);
		l3.add("b");
		System.out.println(l3.size());
		System.out.println(l3);
		l3.add("c");
		System.out.println(l3.size());
		System.out.println(l3);
		l3.add("d");
		l3.add("e");
		l3.add("f");
		l3.add("g");
		l3.add("h");
		l3.add("i");
		l3.add("j");
		l3.add("k");
		l3.add("l");
		l3.add("m");
		
		System.out.println(l3.size());
		System.out.println(l3);
		l3.add(0,"1");
		l3.add(3,"2");
		System.out.println(l3.size());
		System.out.println(l3);
		System.out.println(l3.reverseToString());
		System.out.println("3th element "+l3.get(3));
		System.out.println("5th element "+l3.get(5));
		System.out.println("7th element "+l3.get(7));
		System.out.println("remove element g "+l3.remove("g"));
		System.out.println(l3);
		System.out.println("remove element a "+l3.remove("a"));
		System.out.println(l3);
		System.out.println("remove element b "+l3.remove("b"));
		System.out.println(l3);
		System.out.println("remove element 2 "+l3.remove("2"));
		System.out.println(l3);
		System.out.println("remove element h "+l3.remove("h"));
		
		System.out.println(l3);
		System.out.println("remove element f "+l3.remove("f"));
		
		System.out.println(l3);
		System.out.println("remove element e "+l3.remove("e"));
		System.out.println(l3);
		System.out.println("size is ?"+l3.size()+" .remove element 7 "+l3.remove(7));
		
		System.out.println("The index of i is "+l3.indexOf("i"));
		System.out.println(l3);
		
		
		
		
	}	
}
