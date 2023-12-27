package com.week8.recorded.add.two.linkedlist;


public class AddTwoLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode n1 = new ListNode(9);
		ListNode n2 = new ListNode(9);
//		ListNode n5 = new ListNode(9);
		
		
		
		ListNode l2 = new ListNode(9);
		ListNode n4 = new ListNode(9);
		ListNode n6 = new ListNode(9);
//		ListNode n7 = new ListNode(9);

		l1.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
//		n2.next = n5;
		
		l2.next = n4;
		n4.next = n6;
//		n6.next = n7;
		
	

		iterate(l1);
		iterate(l2);
	ListNode answer=	addTwoLinkedList(l1, l2);
		iterate(answer);
	}
	
	static ListNode addTwoLinkedList(ListNode l1,ListNode l2) {
		ListNode r1= reverseLinkedList(l1);
		ListNode r2= reverseLinkedList(l2);
		
		int carry=0;
		ListNode ans = null;
		ListNode temp = null;
		
		while(r1!=null || r2!=null || carry!=0) {
			int sum=carry;
			if(r1!=null) {
				sum+=r1.val;
			r1=r1.next;
			}
			if(r2!=null)
			{
				sum+=r2.val;
				r2=r2.next;
			}
			int digit=sum%10;
			 carry=sum/10;
			 
			 ListNode newNode=new ListNode(digit);
			 if(ans==null) {
				 ans=temp=newNode;
			 }else {
				 temp.next=newNode;
				 temp=newNode;
			 }
		}
		return reverseLinkedList(ans);
		
	}

	public static ListNode reverseLinkedList(ListNode head) {
		if(head==null || head.next==null) return head;
		
		ListNode cur= head.next;
		ListNode prev=head;
		
		while(cur!=null) {
			ListNode newNode=cur.next;
			cur.next=prev;
			prev=cur;
			cur=newNode;
		}
		head.next=null;
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