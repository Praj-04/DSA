package com.week16.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class ZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(8);
		Node n5 = new Node(10);
		Node n6 = new Node(9);
		Node n7 = new Node(-3);

		Node root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		System.out.println(zigzagLevelOrder(root));
	}

	

	public static List<List<Integer>> zigzagLevelOrder(Node root) {
	     List<List<Integer>> ans = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		if (root == null)
			return ans;

		q.add(root);

    boolean set=true;
		while (!q.isEmpty()) {
     
			int n = q.size();
			List<Integer> curList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				Node cur = q.poll();
			curList.add(cur.data);
				
				if (cur.left != null) {
					q.add(cur.left);
				}
				if (cur.right != null) {
					q.add(cur.right);
				}
			}
		
			
     if(!set){
       Collections.reverse(curList);
     }
		
     ans.add(curList);
			
     set=!set;
		}
		return ans;

	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		super();
		this.data = data;
	}
}
