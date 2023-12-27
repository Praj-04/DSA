package com.week16.day3.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalBFS {

	static ArrayList<Integer> printLevelWiseNodes(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();

		if (root == null)
			return ans;

		q.add(root);

		while (!q.isEmpty()) {
			Node cur = q.poll();
			ans.add(cur.data);
			if (cur.left != null)
				q.add(cur.left);
			if (cur.right != null)
				q.add(cur.right);
		}

		return ans;

	}

	static ArrayList<ArrayList<Integer>> printLevelWiseNodes2(Node root) {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();

		if (root == null)
			return ans;

		q.add(root);
		q.add(null);

		ArrayList<Integer> curList = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			Node cur = q.poll();
			if (cur == null) {
				ans.add(curList);
				if (q.isEmpty()) {
					break;
				}
				curList = new ArrayList<>();
				q.add(null);
			} else {
				curList.add(cur.data);
				if (cur.left != null)
					q.add(cur.left);
				if (cur.right != null)
					q.add(cur.right);

			}

		}

		return ans;
	}

	static ArrayList<ArrayList<Integer>> printLevelWiseNodes3(Node root) {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();

		if (root == null)
			return ans;

		q.add(root);

		while (!q.isEmpty()) {
			int n = q.size();
			ArrayList<Integer> curList = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {

				Node cur = q.poll();
				curList.add(cur.data);
				if (cur.left != null)
					q.add(cur.left);
				if (cur.right != null)
					q.add(cur.right);
			}
			ans.add(curList);

		}

		return ans;
	}
}
