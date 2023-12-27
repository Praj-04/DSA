package com.week16.day2.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ElementsAtDistanceKIteratively {
	
	
	static class Pair{
		Node node;
		int level;
		public Pair(Node node, int level) {
			super();
			this.node = node;
			this.level = level;
		}
		
		
	}

	static ArrayList<Integer> nodesAtLevelK(Node root,int level) {
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayDeque<Pair> stack = new ArrayDeque<>();
		

		Pair first= new Pair(root,level);
		stack.push(first);
		
		while(!stack.isEmpty()) {
			Pair cur = stack.poll();
			if(cur.node== null) continue;
			if(cur.level==0) {
				ans.add(cur.node.data);
				continue;
			}
			
			stack.push(new Pair(cur.node.right,cur.level-1));
			stack.push(new Pair(cur.node.left,cur.level-1));
		}
		return ans;
	}
}