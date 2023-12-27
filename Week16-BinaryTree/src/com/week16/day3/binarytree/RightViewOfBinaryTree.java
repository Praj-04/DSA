package com.week16.day3.binarytree;

import java.util.ArrayList;

public class RightViewOfBinaryTree {

	
	public static void rightView(Node root,int level,ArrayList<Integer> ans) {
		
		if(root==null) return;
		
		if(level>=ans.size()) {
			ans.add(root.data);
		}
		
		rightView(root.right, level+1, ans);
		rightView(root.left, level+1, ans);
		
	}
}
