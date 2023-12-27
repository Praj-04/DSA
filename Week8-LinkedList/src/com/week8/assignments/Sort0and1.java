package com.week8.assignments;


class ListNodes {
int val;
ListNodes next;
ListNodes() { val = 0; next = null; }
ListNodes(int val) { this.val = val; next = null; }
ListNodes(int val, ListNodes next) { this.val = val; this.next = next; }
} 

public class  Sort0and1{
	public static void main(String[] args) {
		ListNodes head= new ListNodes(1);
		ListNodes n1= new ListNodes(0);
		ListNodes n2= new ListNodes(0);
		ListNodes n3= new ListNodes(1);
		ListNodes n4= new ListNodes(0);

		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		 head= sortBinaryList(head);
		iterate(head);
	}
	
	public static void iterate(ListNodes head) {
		ListNodes temp=head;
		
		while(temp!=null) {
			System.out.print(temp.val +" -> ");
			temp=temp.next;
		}
	}
	
	
public static ListNodes sortBinaryList(ListNodes A) {
ListNodes temp=A;

 int count1=0;
  int count0=0;

 while(temp!=null){
	 
    if(temp.val==1){
    	 System.out.println("2st");
      count1++;
      temp=temp.next;;
      
    } else if(temp.val==0){
    	 System.out.println("3st");
      count0++;
      temp=temp.next;
    }
    
  }
  System.out.println(count0);
  System.out.println(count1);

 temp=A;
  
  while(count0!=0){
	  
    temp.val=0;
    temp=temp.next;
    count0--;
      }
  while(count1!=0){
    temp.val=1;
    temp=temp.next;
    count1--;
  }
  
 
  return A;



  
}
}
