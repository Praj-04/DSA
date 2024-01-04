package com.week17.day3;

import java.util.ArrayDeque;

import com.week17.day3.MainClass.Node;

public class IterativeInOrderTraversal {
 
	
	static void printInOrderIterative(Node root) {
		if(root==null) return ;
		
		Node cur=root;
		ArrayDeque<Node> stack = new ArrayDeque<>();
		
		while(!stack.isEmpty() || cur!=null) {
			while(cur!=null) {
				stack.push(cur);
				cur=cur.left;
			}
			
			Node pop=stack.pop();
			System.out.print(pop.data+" ");
			cur=pop.right;
		}
		
	}
}
