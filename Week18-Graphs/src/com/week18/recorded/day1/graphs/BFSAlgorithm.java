package com.week18.recorded.day1.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSAlgorithm {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

		// linked list
		int V = 4;
		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 0, 3);
		addEdge(graph, 1, 2);
//
//		boolean[] vis = new boolean[V];
//
//		int src = 3;
//
//		// to find distance from source
//		int[] dist = new int[V];
//
//		// finding the path
//		int[] precedence = new int[V];
//
//		bfsTraversal(graph, src, vis, dist, precedence);
//
//		// print the distance from source to its nodes
//		for (int i = 0; i < dist.length; i++) {
//			System.out.print("distance from " + src + " to " + i + " => " + dist[i]);
//			System.out.println();
		//}

		findPathFromSrcToDest(graph, 3, 1);
	}

	

	static void findPathFromSrcToDest(ArrayList<ArrayList<Integer>> graph, int src, int dest) {
		int V = 4;
		boolean[] vis = new boolean[V];

		int[] dist = new int[V];
		int[] precedence = new int[V];
		bfsTraversal(graph, src, vis, dist, precedence);

		while (dest != -1) {
			System.out.println(dest);
			dest = precedence[dest];
		}
	}

	static void addEdge(ArrayList<ArrayList<Integer>> graph, int a, int b) {
		if (graph.get(a).contains(b))
			return;
		graph.get(a).add(b);
		graph.get(b).add(a);// for unidirection we should not add this
	}

	static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis, int[] dist,
			int[] precedence) {
		Queue<Integer> q = new LinkedList<>();

		q.add(src);
		vis[src] = true;
		dist[src] = 0;
		precedence[src]=-1; //set precedence of src t0 -1

		while (!q.isEmpty()) {
			int cur = q.poll();
//			System.out.println(cur);
			for (int neighbor : graph.get(cur)) {
				if (!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					dist[neighbor] = dist[cur] + 1; // distnce from the src to this newly added node
					precedence[neighbor] = cur; // adding precedence of the new node
				}
			}
		}

	}

}
