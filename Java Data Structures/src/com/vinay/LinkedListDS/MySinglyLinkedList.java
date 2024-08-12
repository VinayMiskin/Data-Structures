package com.vinay.LinkedListDS;

public class  MySinglyLinkedList <T> {
	
	private Node head;
	private Node tail;
	private int size;
	public MySinglyLinkedList() {
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean add(T element) {
		
		Node<T> node = new Node<>(element);
		if(head==null) {
			head = node;
			tail = node;
			size++;
			return true;
		}
		else {
			tail.setNextNode(node);
			tail = node;
			size++;
			return true;
		}
	}
	
	public void add(int index,T element) {
		
		if(index > size)
			throw new IllegalArgumentException();
		Node<T> node = new Node<>(element);
		if(index==0) {
			node.setNextNode(head);
			head = node;
			size++;
			return;
		}
		else if(index == size) {
			tail.setNextNode(node);
			tail = node;
			size++;
			return;
		}
		else {
			System.out.println("in the else part");
			
			Node temp = head;
			while( index != 1) {
				
				temp = temp.getNextNode();
				index--;
				
			}
			node.setNextNode(temp.getNextNode());
			temp.setNextNode(node);
			size++;
		}
	}
	
	@Override
	public String toString() {
		String list="[ ";
		if(size > 0) {
			Node temp=head;
			
			while (temp != null) {
				list += temp.getElement();
				if(temp.getNextNode() !=null)
					list += ", ";
				
				temp = temp.getNextNode();
			}
			
		}
		
		
		list += " ]";
		return list;
	}
	
	public boolean contains(T element) {
		Node temp=head;
		while(temp!= null) {
			if(element.equals(temp.getElement()))
				return true;
			temp=temp.getNextNode();
		}
		return false;
	}
	
	public T get(int index) {
		if(index > size)
			throw new IllegalArgumentException();
		if(index == 0)
			return (T)head.getElement();
		else if(index == size)
			return (T)tail.getElement();
		Node temp=head;
		while(index != 0) {
			temp = temp.getNextNode();
			index--;
		}
		return (T)temp.getElement();
	}
	public T getFirst() {
		return (T)head.getElement();
	}
	
	public T getLast() {
		return (T)tail.getElement();
	}
	
	public boolean remove(T element) {
		if(head.getElement().equals(element)) {
			head = head.getNextNode(); 
			return  true;
		}
		Node temp = head.getNextNode();
		Node tempPrev = head;
		
		while(temp != null) {
			if(temp.getElement().equals(element)) {
				tempPrev.setNextNode(temp.getNextNode());
				return true;
			}
			tempPrev = temp;
			temp = temp.getNextNode();
		}
		return false;
			
	}
}
