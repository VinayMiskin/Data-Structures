package com.vinay.StackDS;

import java.util.EmptyStackException;

public class MyStack<T> {
	T[] array;
	int size = 0;
	
	public MyStack(int n) {
		if(n > 0)
			array = (T[])new Object[n];
	}
	
	public boolean empty() {
		if(size == 0)
			return true;
		else
			return false;
	}
	
	public T peek(){
		if(size > 0)
			return array[size-1];
		else
			return null;
	}
	
	public T push(T element)  {
		if(array.length > size) {
			array[size] = element;
			size++;
			return element;
		}
		else
			throw new IndexOutOfBoundsException();
	}
	
	public T pop() {
		if(size >= 0) {
			T element = array[size-1];
			array[size-1] = null;
			size--;
			return element;
		} else
			throw new EmptyStackException();
	}
	
	public int search(Object o) {
		try {
			T element = (T)o;
			for (int i = 0; i < size; i++) {
				if(array[i] == element)
					return i;
			}
			
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		return -1;
	}
}
