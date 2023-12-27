package com.week16.day5.binarytree;

public class LowestCommonAncestor {

	
	static Node lca(Node root,int a,int b) {
		
		if(root==null) return null;
		
		if(root.data==a || root.data==b) return root;
		
		Node left = lca(root.left,a,b);
		Node right=lca(root.right,a,b);
		
		if(left==null) return right;
		if(right==null) return left;
		return root;
	}
}
