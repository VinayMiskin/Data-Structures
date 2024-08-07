package com.vinay.ArrayListDS;

import java.util.ArrayList;

public class TestAL {
	public static void main(String[] args) {
		MyArrayList<String> s=new MyArrayList<>(25);
		System.out.println("size="+s.size());
		s.add("Hi");
		s.add(1, "Nha");
		s.add(2, "nee");
		s.add("Hello");
		System.out.println("size="+s.size());
		System.out.println(s);
		System.out.println("The equal result is ?  "+s.contains("Nee"));
		System.out.println("The equal result is ?  "+s.indexOf("nee"));
		
		
//		System.out.println(s);
//		System.out.println("size="+s.size());
	}
}
