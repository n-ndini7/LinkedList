package com.capgemini;

import org.junit.Test;

import com.capgemini.LinkedList;
import com.capgemini.Node;
import static org.junit.Assert.assertEquals;

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

}