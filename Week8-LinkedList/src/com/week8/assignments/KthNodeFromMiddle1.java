package com.week8.assignments;

public class KthNodeFromMiddle1 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);

		head.next=n1; // adding n1's address to head's ref part
		n1.next=n2;
		n2.next=n3;
		
		
		int B = 2;
		int pos = kthNode(head, B);
		System.out.println(pos);

	}

	public static int kthNode(ListNode head, int B) {
		int middle = findMiddleNode(head);
		int pos = middle - B;

		if (pos <= 0) {
			return -1;
		}
		ListNode temp = head;

		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}

		return temp.val;

	}

	static int findMiddleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		int count = 1;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			count++;
		}
//		System.out.println(count);
		return count;
	}


}
class ListNode {
	int val;
	ListNode next;

	

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	
}