package com.week17.assignment;

import com.week17.assignment.MainClass.Node;

public class RecoverBST {

	public static Node left,mid,right; 	
	static Node recoverBST(Node root) {
		
		recoverBSTUtil(root,null);
		if(left!=null && right!=null) {
			swap(left,right);
		}
		if(left!=null && right==null) {
			swap(left,mid);
		}
		return root;
	}
	public static void swap(Node one, Node two) {

		int temp=two.data;
		two.data=one.data;
		one.data=temp;
	}
	
	public void inOrder(Node root) {
		if(root==null) return;
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	public static void recoverBSTUtil(Node root, Node prev) {
		if(root==null) return;
		
		recoverBSTUtil(root.left, prev);
		if(prev!=null) {
			if(root.data<prev.data) {
				if(left==null) { //1st anomaly found
					left=prev;
					mid=root;
				}else {  //2nd anomaly
					right=root;
					return;
				}
			}
		}
		
		prev=root;
		recoverBSTUtil(root.right, prev);
	}
}
