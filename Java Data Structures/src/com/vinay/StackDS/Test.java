package com.vinay.StackDS;

public class Test {

	public static void main(String[] args) {
		MyStack<String> ms = new MyStack<>(5);
		System.out.println(ms.empty());
		System.out.println(ms.peek());
		System.out.println(ms.push("Ajay"));
		System.out.println(ms.push("Suresh"));
		System.out.println(ms.push("Gajesh"));
		System.out.println(ms.empty());
		System.out.println(ms.peek());
		//System.out.println(ms.pop());
		System.out.println(ms.search("Gajesh"));
		
	}

}
