package com.vinay.ArrayListDS;

import java.util.Collection;

public class MyArrayList <T>{
	private T[] array;
	private int size;//Number of objects stored
	
	public MyArrayList() {
		
	}
	public MyArrayList(int arrayLength) {
		array =(T[])new Object[arrayLength];
	}
			
	public <E extends T> boolean add(E element) {
		
		if(array==null) {
			System.out.println("Creating and adding "+element);
			array=(T[])new Object[10];
			array[size]=element;
			size++;
			return true;
		}
		else {
			System.out.println("adding "+element);
			array[size]=element;
			size++;
			return true;
		}
	}
	
	public <E extends T> void add(int index, E element) {
		
		if(index>size) 
			throw new ArrayIndexOutOfBoundsException(index);
		else if(size==index){
			array[size]=element;
			size++;
		}
		else {
			for (int i = size; i > index; i--) {
				array[i+1]=array[i];
			}
			array[index]=element;
			size++;
		}
	}
	
	
	public boolean contains(Object o) {
		
		for (int i = 0; i < size; i++) {
			if(array[i].equals(o))
				return true;
		}
		
		return false;
	}
	
	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if(array[i].equals(o))
				return i;
		}
		
		return -1;
	}
	public <E extends T> E remove(int index){
		E e;
		if(index<=size) {
			e=(E)array[index];
			for (int i = index; i < size-1; i++) {
				array[i]=array[i+1];
			}
			size--;
			return e;
		}
		else 
			throw new ArrayIndexOutOfBoundsException(index);
	}
	
	public <E extends T> boolean remove(E element) {
		
			
		for (int i = 0; i < size; i++) {
			if(array[i].equals(element)) {
				remove(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	public int size() {
		return size;
	}
	@Override
	public String toString() {
		String s="{";
		for (int i = 0; i < size; i++) {
			s+=array[i];
			if(i!=size-1)
				s+=", ";
		}
		s+="}";
		return s;
	}
}
