package com.week8.assignments;

public class RemoveNthNode {

	public static void main(String[] args) {
		ListNodess head= new ListNodess(1);
		ListNodess n1= new ListNodess(2);
		ListNodess n2= new ListNodess(3);
		ListNodess n3= new ListNodess(4);
		ListNodess n4= new ListNodess(5);

		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		int n=5;
		 head= removeKNode(head,n);
		iterate(head);
	}
	
	
	public static void iterate(ListNodess head) {
		ListNodess temp=head;
		
		
		while(temp!=null) {
			System.out.print(temp.val +" -> ");
			temp=temp.next;
		}
	}

	
	private static ListNodess removeKNode(ListNodess head, int n) {
ListNodess temp = head;


int length=0;
while(temp!=null) {
	temp=temp.next;
	length++;
}

System.out.println(length);	
int pos=length-n;
System.out.println(pos);

int loop=0;
if(pos<=0) return head.next;

ListNodess newNode=head;

//for(int i=0;i<pos-1;i++) {
//	newNode=newNode.next;
//}
//newNode.next=newNode.next.next;

while(newNode!=null && newNode.next!= null) {
	
	if(loop==pos-1) {
		newNode.next=newNode.next.next;
	
	}
	newNode=newNode.next;
	loop++;
	}
		
		return head;
	}

	

}





class ListNodess {
int val;
ListNodess next;
ListNodess() { val = 0; next = null; }
ListNodess(int val) { this.val = val; next = null; }
ListNodess(int val, ListNodess next) { this.val = val; this.next = next; }
} 

