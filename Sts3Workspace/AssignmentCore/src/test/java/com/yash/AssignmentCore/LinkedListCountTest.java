package com.yash.AssignmentCore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListCountTest {

	LinkedListCount linkedListCount = new LinkedListCount();

	@Test
	public void shouldReturnLengthOfLoopInLinkedList() {
		Node linkedList = new Node(1);
		linkedList.next = new Node(2);
		linkedList.next.next = new Node(3);
		linkedList.next.next.next = new Node(4);
		linkedList.next.next.next.next = new Node(5);
		linkedList.next.next.next.next.next = linkedList.next;

		int expectedLength = 4;

		int actualLength = linkedListCount.countLengthOfLoop(linkedList);

		assertEquals(expectedLength, actualLength);

	}

	@Test
	public void shouldReturnZeroIfLinkedListNotHaveAnyLoop() {
		Node linkedList = new Node(1);
		linkedList.next = new Node(2);
		linkedList.next.next = new Node(3);
		linkedList.next.next.next = new Node(4);
		linkedList.next.next.next.next = new Node(5);

		int expectedLength = 0;

		int actualLength = linkedListCount.countLengthOfLoop(linkedList);

		assertEquals(expectedLength, actualLength);

	}

}
