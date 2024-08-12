package com.vinay.ArrayListDS;

import java.util.Collection;

public class MyArrayList <T>{
	private T[] array;
	private int size;//Number of objects stored
	
	public MyArrayList() {
		System.out.println("using no-arg contr");
	}
	public MyArrayList(int arrayLength) {
		System.out.println("Create an ArrayList of given size "+arrayLength);
		array =(T[])new Object[arrayLength];
	}
			
	public <E extends T> boolean add(E element) {
		
		if(array==null) {
			/*if the array var is null
			 * then create new array with length 10 
			 * then add element
			 */
			
			array=(T[])new Object[10];
			array[size]=element;
			size++;
			return true;
		}
		//Compare actual length and size(number of elements added)
		else if(array.length > size) {
			
			array[size]=element;
			size++;
			return true;
		}
		else {
			/*if array does,t have space or reached to last index
			 * then create new array
			 * transfer all the elements to new array
			 * then reassign the ref of new array to instance variable 'array'
			 */
			int length=(int)(array.length*0.5)+array.length;
			
			
			T[] array2=(T[])new Object[length];
			for (int i = 0; i < size; i++) {
				array2[i]=array[i];
			}
			array=array2;
			array[size] = element;
			size++;
			return true;
		}
	}
	
	public <E extends T> void add(int index, E element) {
		/*
		 * 1st check whether the given index is greater than the size. i.e, index > size
		 * if true,then throw AIOOBEx
		 * if false,then proceed to add the element
		 * now check whether index is at the end of the Collection then add directly if there is empty box and size++
		 * else if the array doesn't have space then create new array then add element 1st if index=0 
		 * 		then copy all the element to new array then at the end assign new array ref to old array variable and size++
		 * else if the index==size then copy all the element to new array 
		 * 		then at the end assign new array ref to old array variable
		 * 		then at the element at the end and size++
		 */
		
		if(index > size) 
			throw new ArrayIndexOutOfBoundsException(index);
		else if(size == index){
			
			array[size] = element;
			size++;
		}
		else if(index == 0) {
			if(array.length > size) {
				
				for (int j = size; j >0; j--) {
					array[j] = array[j-1];
				}
				array[0]=element;
				size++;
				return;
			}
			else {
				
				int length=(int)(array.length*0.5);
				T[] array2=(T[])new Object[length];
				
				for (int j = size; j > 0; j--) {
					array[j+1] = array[j];
				}
				array[0]=element;
				size++;
				return;
			}
		}
		else if(array.length > size) {
			
			for (int i = size; i >= index; i--) {
				array[i+1] = array[i];
			}
			array[index] = element;
			
			size++;
			return;
		}
		else {
			int length=(int)(array.length*0.5)+array.length;
			T[] array2=(T[])new Object[length];
			
			
			for (int i = 0; i < index; i++) {
				array2[i] = array[i];
			}
			array2[index] = element;
			for (int i = index; i < size; i++) {
				array2[i+1] = array[i];
			}
			
			array=array2;
			size++;
		}
	}
	
	
	public boolean contains(T element) {
		
		for (int i = 0; i < size; i++) {
			if(element.equals(array[i]))
				return true;
		}
		
		return false;
	}
	
	public int indexOf(T element) {
		for (int i = 0; i < size; i++) {
			if(element.equals(array[i]))
				return i;
		}
		
		return -1;
	}
	
	public T get(int index) {
		
		return array[index];
	}
	
	public T remove(int index){
		T e;
		if(index<=size) {
			e=array[index];
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
		String s="[";
		for (int i = 0; i < size; i++) {
			s+=array[i];
			if(i!=size-1)
				s+=", ";
		}
		s+="]";
		return s;
	}
}
