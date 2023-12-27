package com.week16.day2.binarytree;

import java.util.ArrayList;

public class ElementsAtDistanceKRecursively {

	static void nodesAtLevelK(Node root, int level, ArrayList<Integer> ans) {
		if(root==null || level<0) return;
		
		if(level==0) {
			ans.add(root.data);
		}
		
		nodesAtLevelK(root.left, level-1, ans);
		nodesAtLevelK(root.right, level-1, ans);

	}
}