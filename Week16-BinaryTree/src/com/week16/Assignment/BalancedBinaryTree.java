package com.week16.Assignment;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(8);
		TreeNode n5 = new TreeNode(10);
		TreeNode n6 = new TreeNode(9);
		TreeNode n7 = new TreeNode(-3);

		TreeNode root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		System.out.println(isItHeightBalanced(root));
	}
	
	public static boolean isItHeightBalanced(TreeNode root){
		return getHeight(root) != -1;
	}

	private static int getHeight(TreeNode root) {
		if(root==null) return 0;
		
		int leftHeight = getHeight(root.left);
		if(leftHeight== -1) {
			return -1;
		}
		
		int rightHeight = getHeight(root.right);
		if(rightHeight== -1) {
			return -1;
		}
		
		//see if height diff between left and right > 1
		
		if(Math.abs(leftHeight-rightHeight)>1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight)+1;
		
	}
	
}

	
	 class TreeNode {
		      int val;
		    TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		     TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		         this.val = val;
		         this.left = left;
		         this.right = right;
		     }
		 }

