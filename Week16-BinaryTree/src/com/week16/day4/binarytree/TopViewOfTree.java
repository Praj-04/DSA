package com.week16.day4.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfTree {

	static class Pair { // when we insert into queue i will store( hd,node)
		int horizontalDistance;
		Node node;

		public Pair(int horizontalDistance, Node node) {
			super();
			this.horizontalDistance = horizontalDistance;
			this.node = node;
		}

	}

	static ArrayList<Integer> topViewOfTree(Node root) {
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();

		// here we are doing level order traversal(BFS)
		// add the root
		q.add(new Pair(0, root));

		while (!q.isEmpty()) {
			Pair cur = q.poll();

			map.putIfAbsent(cur.horizontalDistance, cur.node.data);

			if (cur.node.left != null) {
				q.add(new Pair(cur.horizontalDistance - 1, cur.node.left));
			}

			if (cur.node.right != null) {
				q.add(new Pair(cur.horizontalDistance + 1, cur.node.right));
			} 
		}
		return new ArrayList<>(map.values());
	}
	
	

}