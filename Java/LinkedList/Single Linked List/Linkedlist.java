package com.linkedlist.Practise;

public class Linkedlist<T> {

	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public void insert(T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			head = node;
		}else {
			Node<T> n = head;
			while(n.getNext()!=null) {
				n = n.getNext();
			}
			n.setNext(node);
			
		}
	}
	
	public void insertAtStart(T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertAt(int index, T data) {
		Node<T> node = new Node<T>();
		node.setData(data);
		node.setNext(null);
		
		if(index==0) {
			insertAtStart(data);
		}else {
		Node<T> n = head;
		for(int i =0; i<index -1; i++) {
			n = n.getNext();
		}
		node.setNext(n.getNext());
		n.setNext(node);
		}
	}
	
	public void delete(int index) {
		if(index ==0) {
			head = head.getNext();
		}else {
			Node<T> n = head;
			Node<T> n1 = null;
			for(int i =0; i<index -1; i++) {
				n = n.getNext();
			}
			n1 = n.getNext();
			n.setNext(n1.getNext());
			n1 = null;
		}
		
	}
	
	public void show() {
		Node<T> node = head;
		while(node!=null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
}
