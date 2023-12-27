package com.week8.assignments;

class ListNodeLC {
	int val;
	ListNodeLC next;

	ListNodeLC() {
		val = 0;
		next = null;
	}

	ListNodeLC(int val) {
		this.val = val;
		next = null;
	}

	ListNodeLC(int val, ListNodeLC next) {
		this.val = val;
		this.next = next;
	}
}

public class ListCycle {

	public static void main(String[] args) {
		ListNodeLC head = new ListNodeLC(1);
		ListNodeLC n1 = new ListNodeLC(2);
		ListNodeLC n2 = new ListNodeLC(3);
		ListNodeLC n3 = new ListNodeLC(4);
		ListNodeLC n4 = new ListNodeLC(2);

		head.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		
		iterate(head);
	ListNodeLC outputNode=detectCycle(head);
		System.out.println(outputNode);
	}

	public static void iterate(ListNodeLC head) {
		ListNodeLC temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}

	public static ListNodeLC detectCycle(ListNodeLC A) {
		ListNodeLC head=A;
		ListNodeLC slow =  A;
		ListNodeLC fast = A;
		ListNodeLC ans = new ListNodeLC(-1);

		boolean flag=false;
		while(fast!=null && fast.next!=null){
		slow= slow.next;
		fast=fast.next.next;
		if(slow==fast){
		 flag=true;
		 break;
		}


		}
		if(flag==false){
		  return null;
		}

		ListNodeLC first = A;
		ListNodeLC second = A.next;
		while(first.val!=second.val){
		  first= first.next;
		  second= second.next;
		  
		}
		System.out.println(first.val);
		return first;

	}
}
