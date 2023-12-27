package com.week8.recorded.reorder.list;

public class ReOrderList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
//		ListNode n4 = new ListNode(5);

		head.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
		n2.next = n3;
//		n3.next=n4;

		iterate(head);
		ListNode answer = reOrderList(head);

		iterate(answer);

	}

	private static ListNode reOrderList(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode l2 = reverseTheList(slow);

		ListNode l1 = head;

		
		while(true) {
			
			if(l1==l2) {
				l1.next=null;
				break;
			}
			 if(l2.next==null){
//	              l1.next=l2;
//	              l2.next=null;
	              break;
	          }
		ListNode l1Next=l1.next;
		ListNode l2Next=l2.next;
		
		l1.next=l2;
		l2.next=l1Next;
		
		l1=l1Next;
		l2=l2Next;
			
			
		}
		
		return head;
		
	}

	private static ListNode reverseTheList(ListNode slow) {
		ListNode prev = slow;
		ListNode cur = slow.next;

		while (cur != null) {
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		slow.next = null;
		return prev;

	}

	public static void iterate(ListNode head) {
		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println();
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