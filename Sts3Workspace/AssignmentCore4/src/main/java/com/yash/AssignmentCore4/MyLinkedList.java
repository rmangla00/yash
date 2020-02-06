package com.yash.AssignmentCore4;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class MyLinkedList {

	private Node head;

	public boolean add(int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node itr = head;
			while (itr.next != null) {
				itr = itr.next;
			}
			itr.next = new Node(value);
		}
		return false;
	}

	public MyLinkedList sortAndRemoveDuplicates() {
		Node itr = head;
		int size = 0;
		while (itr.next != null) {
			itr = itr.next;
			size++;
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return null;
	}

	@Override
	public String toString() {
		Node itr = head;
		String llist = "";
		while (itr.next != null) {
			llist += itr.data + " ";
			itr = itr.next;
		}
		llist += itr.data + " ";
		return llist;
	}

}
