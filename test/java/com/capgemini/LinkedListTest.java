package com.capgemini;

import org.junit.Test;

import com.capgemini.LinkedList;
import com.capgemini.Node;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

	@Test
	public void testforAdd() {
		System.out.println("This test is for adding node to the list.");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.add(secondNode);
		linkedlist.add(thirdNode);
		linkedlist.print();
		boolean result = linkedlist.head.equals(thirdNode) && linkedlist.head.getNext().equals(secondNode)
				&& linkedlist.tail.equals(firstNode);
		assertEquals(true, result);
	}

	@Test
	public void testforAppend() {
		System.out.println("This is test method for appending element to the list end.");
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(secondNode);
		linkedlist.append(thirdNode);
		linkedlist.print();
		boolean result = linkedlist.head.equals(firstNode) && linkedlist.head.getNext().equals(secondNode)
				&& linkedlist.tail.equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void testforAddInTheMiddleOfTheList() {
		System.out.println("This is test method for inserting element at the middle of the list.");
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(thirdNode);
		linkedlist.insert(firstNode, secondNode);
		linkedlist.print();
		boolean result = linkedlist.head.equals(firstNode) && linkedlist.head.getNext().equals(secondNode)
				&& linkedlist.tail.equals(thirdNode);
		assertEquals(true, result);
	}
}