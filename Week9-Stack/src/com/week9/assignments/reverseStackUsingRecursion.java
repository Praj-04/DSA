package com.week9.assignments;




import java.util.*;

public class reverseStackUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		 reverseStack(s);
		
	 
		 System.out.println(s);
	}
	
 
 
    public static void reverseStack(Stack<Integer> s) {
        //You can code here
if(s.size()==1 || s.size()==0)
        return;
        int temp=s.peek();
        s.pop();
        reverseStack(s);
        insertAtBottom(s,temp);
    }
    public static void insertAtBottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
        }
        else{
            int temp=st.peek();
            st.pop();
            insertAtBottom(st,x);
            st.push(temp);
        }
    }
}