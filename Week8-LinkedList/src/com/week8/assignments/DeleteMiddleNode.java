package com.week8.assignments;

public class DeleteMiddleNode {

	public static void main(String[] args) {
	ListNode1 head= new ListNode1(1);
	ListNode1 n1= new ListNode1(2);
	ListNode1 n2= new ListNode1(3);
	ListNode1 n3= new ListNode1(4);
	ListNode1 n4= new ListNode1(5);
//	ListNode1 n5= new ListNode1(6);
	head.next=n1;
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
//	n4.next=n5;
	
	

	ListNode1 temp=head;
	
	int pos= findMiddleNodePos(head);
//	System.out.println(pos);
	
	for(int i=0;i<pos-1;i++) {
//		System.out.println(temp.val);
		temp=temp.next;
	}
	
	temp.next=temp.next.next;
	
 iterate(head);
	
	
}
	private static int findMiddleNodePos(ListNode1 head) {
		
		ListNode1 slow=head;
		ListNode1 fast=head;
		int count=0;
		if(head==null || head.next==null ) return head.val;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			count++;
		}
//		System.out.println("the count is");
		
		return count;
	}




public static void iterate(ListNode1 head) {
	ListNode1 temp=head;
	
	while(temp!=null) {
		System.out.print(temp.val +" -> ");
		temp=temp.next;
	}
}

	
}


class ListNode1 {
int val;
ListNode1 next;
ListNode1() { val = 0; next = null; }
ListNode1(int val) { this.val = val; next = null; }
ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}