package com.week17.assignment;

import com.week17.assignment.MainClass.Node;

public class searchInBinaryTree {

	public Node searchBST(Node root, int val) {
	     if(root==null) return null;
	     if(root.data>val){
	      return searchBST(root.left,val);
	     }
	else if(root.data<val){
	  return searchBST(root.right,val);
	}
	else  return root;


	        
	    }
}
