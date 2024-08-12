package com.vinay.LinkedListDS;

public class MyDoublyLinkedList<T> {
	private Node head;
	private Node tail;
	private int size;
	public MyDoublyLinkedList() {
		
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
			node.setPrevNode(tail);
			tail = node;
			size++;
			return true;
		}
	}
	
	public void add(int index,T element) {
		
		if(index > size)
			throw new IndexOutOfBoundsException();
		Node<T> node = new Node<>(element);
		if(index==0) {
			node.setNextNode(head);
			head.setPrevNode(node);
			head = node;
			size++;
			return;
		}
		else if(index == size) {
			tail.setNextNode(node);
			node.setPrevNode(tail);
			tail = node;
			size++;
			return;
		}
		else {
			Node temp = head;
			while( index != 1) {
				
				temp = temp.getNextNode();
				index--;
				
			}
			node.setNextNode(temp.getNextNode());
			temp.getNextNode().setPrevNode(node);
			temp.setNextNode(node);
			node.setPrevNode(temp);
			size++;
		}
	}
	
	@Override
	public String toString() {
		String list = "[ ";
		Node temp = head;
		while (temp != null) {
			list += temp.getElement();
			if(temp.getNextNode() != null)
				list += ", ";
			temp =temp.getNextNode();
		}
		list += " ]";
		return list;
	}
	
	public String reverseToString() {
		String list = "[ ";
		Node temp = tail;
		while (temp != null) {
			list += temp.getElement();
			if(temp.getPrevNode() != null)
				list += ", ";
			temp =temp.getPrevNode();
		}
		list += " ]";
		return list;
	}
	
	public boolean contains(T element) {
		Node temp=head;
		while(temp!= null) {
			if(element.equals((T)temp.getElement()))
				return true;
			temp=temp.getNextNode();
		}
		return false;
	}
	
	public T get(int index) {
		if(index > size)
			throw new IndexOutOfBoundsException();
		
		if(index == 0)
			return (T)head.getElement();
		else if(index == size)
			return (T)tail.getElement();
		//if the index value is less than the half of the value of size then begin traversal from head
		if((size / 2) > index) {
			System.out.println("forward");
			Node temp = head;
			while(index != 0) {
				temp = temp.getNextNode();
				index--;
			}
			return (T)temp.getElement();
		}
		else {
			System.out.println("Reverse");
			Node temp = tail;
			int value = size - index;
			while(value != 1) {
				temp = temp.getPrevNode();
				value--;
			}
			return (T)temp.getElement();
		}
		
	}
	public T getFirst() {
		return (T)head.getElement();
	}
	
	public T getLast() {
		return (T)tail.getElement();
	}
	
	public boolean remove(T element) {
		if(element.equals((T)head.getElement())) {
			head = head.getNextNode();
			head.setPrevNode(null);
			size--;
			return  true;
		}
		Node temp = head;
		
		while(temp != null) {
			if(element.equals((T)temp.getElement())) {
				temp.getPrevNode().setNextNode(temp.getNextNode());
				if(temp.getNextNode() != null)
					temp.getNextNode().setPrevNode(temp.getPrevNode());
				else {
					tail = temp;
				}
				size--;
				return true;
			}
			temp = temp.getNextNode();
		}
		return false;
			
	}
	public T remove(int index) {
		if(index > size)
			throw new IndexOutOfBoundsException();
		T element;
		if( index == 0) {
			element = (T)head.getElement();
			head = head.getNextNode();
			head.setPrevNode(null);
			size--;
			return element;
		}
		else if(index == size-1) {
			element = (T)tail.getElement();
			tail.getPrevNode().setNextNode(null);
			tail = tail.getPrevNode();
			size--;
			return element;
		}
		if(index < (size-1 / 2)) {
			System.out.println("Forward");
			Node temp = head.getNextNode();
			while(index != 1) {
				temp = temp.getNextNode();
				index--;
			}
			element = (T)temp.getElement();
			temp.getNextNode().setPrevNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(temp.getNextNode());
			size--;
			return element;
		}
		else {
			System.out.println("Backward");
			int value = size - index;
			Node temp = tail;
			while(value != 0) {
				temp = temp.getPrevNode();
				value--;
			}
			element = (T)temp.getElement();
			temp.getNextNode().setPrevNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(temp.getNextNode());
			size--;
			return element;
		}
		
		
	}
	
	public int indexOf(T element) {
		
		if(element.equals((T)head.getElement())) {
			head = head.getNextNode(); 
			size--;
			return  0;
		}
		Node temp = head;
		
		int count = 0;
		while(temp != null) {
			if(element.equals((T)temp.getElement())) {
				return count;
			}
			count++;
			temp = temp.getNextNode();
		}
		return -1;
	}
	
	
}
