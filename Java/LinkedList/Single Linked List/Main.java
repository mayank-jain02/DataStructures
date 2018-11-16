package com.linkedlist.Practise;

public class Main {

	public static void main(String args[]) {
		Linkedlist<Integer> list = new Linkedlist<Integer>();
		list.insert(5);
		list.insertAtStart(45);
		list.insertAtStart(5);
		list.insertAtStart(55);
		
		list.insertAt(3, 55);
		list.delete(3);
		list.show();
	}
}
