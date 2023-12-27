package com.week8.recorded.palindrome.linkedlist;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(1);
//		ListNode n2 = new ListNode(3);
//		ListNode n3 = new ListNode(2);
//		ListNode n4 = new ListNode(1);

		head.next = n1;
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;

		boolean isIt = isItPAlindrome(head);

		System.out.println(isIt);
//		iterate(last);

	}

	private static boolean isItPAlindrome(ListNode head) {
		ListNode middleNode = findMiddleNode(head); //finding middle node

		ListNode last = reverseFromMiddle(middleNode); // reverese the 2nd half

		ListNode start = head; //start the first half from start
		
		
		//check till the end of last is null..loop till it goes from etreme end till midddle..we had set middle.next=null.so go till middle
		while(last!=null) {
			if(start.val!=last.val) {
				return false;
			}
			start=start.next;
			last=last.next;
			
		}
		return true;
	}

	private static ListNode reverseFromMiddle(ListNode middleNode) {

		if (middleNode == null || middleNode.next == null)
			return middleNode;

		ListNode prev = middleNode;
		ListNode cur = middleNode.next;

		while (cur != null) {
			ListNode extra = cur.next;
			cur.next = prev;
			prev = cur;
			cur = extra;
		}
		middleNode.next = null;
		return prev;
	}

	private static ListNode findMiddleNode(ListNode head) {
		 if(head==null || head.next==null) return head;
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

//	public static void iterate(ListNode head) {
//		ListNode temp = head;
//
//		while (temp != null) {
//			System.out.print(temp.val + " -> ");
//			temp = temp.next;
//		}
//	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}

}