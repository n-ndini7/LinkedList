package com.capgemini;

import com.capgemini.INode;

public class LinkedList {

	public INode head;
	public INode tail;
	public int count = 0;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		count++;
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode temp = this.head;
			this.head = newNode;
			this.head.setNext(temp);
		}
	}

	// adds to the linkedlist

	public void print() {
		StringBuffer myNodes = new StringBuffer("Linked List: \n");
		INode temp = head;
		while (temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if (!(temp.equals(tail)))
				myNodes.append("->");
			temp = temp.getNext();
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);
	}
	// prints the linkedlist

	public void append(INode node) {
		count++;
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}

	}
	// append to the list

	public void insert(INode myNode, INode newNode) {
		INode temp = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(temp);
	}

	// insert element in the middle of the list

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	// pop the first element of the list

	public INode popLast() {
		INode temp = head;
		while (!temp.getNext().equals(tail)) {
			temp = temp.getNext();
		}
		this.tail = temp;
		temp = temp.getNext();
		return temp;
	}
	
	// pop the last element of the list
}
