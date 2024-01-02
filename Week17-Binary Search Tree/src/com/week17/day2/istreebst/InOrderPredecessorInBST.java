package com.week17.day2.istreebst;

import com.week17.day2.istreebst.MainClass.Node;

public class InOrderPredecessorInBST {

	
public static Node inOrderPredecessor(Node root,int key,Node predecessor) {
	if(root==null) return null;
	
	if(root.data>key) { //you need to go left
		return inOrderPredecessor(root.left, key, predecessor);
	} else if(root.data<key) { //you need to go right and also track predecessor
		predecessor=root;
		return inOrderPredecessor(root.right, key, predecessor);
	}else {
		if(root.left==null) {
			return predecessor;
		}else {
			return getMax(root.left);
		}
	}
}

private static Node getMax(Node root) {
	while(root.right!=null) {
		
		root=root.right;
	}
	return root;
}
}
