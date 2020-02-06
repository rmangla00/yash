package com.yash.AssignmentCore;


class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class LinkedListCount {

	static int countNodes(Node n) {
		int res = 1;
		Node temp = n;
		while (temp.next != n) {
			res++;
			temp = temp.next;
		}
		return res;
	}

	public int countLengthOfLoop(Node list) {

		Node slow = list, fast = list;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return countNodes(slow);
		}
		return 0;
	}

}
