package com.vinay.LinkedListDS;

public class Node<T> {
	private Node nextNode;
	private T element;
	private Node prevNode;
	
	public Node() {
		
	}
	public Node(T element) {
		this.element = element;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
	
}
