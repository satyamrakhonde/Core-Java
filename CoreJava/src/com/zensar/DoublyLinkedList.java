package com.zensar;

class Node{
	Node prev;
	Node next;
	int data;
	public Node(int data) {
		super();
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}

public class DoublyLinkedList {

	
	void addNode(int data){
		Node n = new Node(data);
		if(Node.prev == null) {
			
		}
		
		
	}
	void removeNode(Node node){
		
		
	}
	
}
