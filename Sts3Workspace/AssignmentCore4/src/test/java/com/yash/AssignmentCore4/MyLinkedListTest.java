package com.yash.AssignmentCore4;

import org.junit.Test;

public class MyLinkedListTest {

	MyLinkedList myLinkedList = new MyLinkedList();

	@Test
	public void shouldSortWhenAndRemoveAllDuplicateFromList() {

		myLinkedList.add(10);
		myLinkedList.add(30);
		myLinkedList.add(70);
		myLinkedList.add(50);
		myLinkedList.add(20);
		myLinkedList.add(80);

		System.out.println(myLinkedList);
//		SortedLinkedList actual = sortedLinkedList.sortAndRemoveDuplicates();

	}

}
