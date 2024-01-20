package com.week18.recorded.day2.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DFSAlgorithm {
	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		int V = 8;

		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}

		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 5);
		addEdge(graph, 5, 2);
		addEdge(graph, 5, 7);
		addEdge(graph, 7, 4);
		addEdge(graph, 7, 6);
		addEdge(graph, 6, 3);
		boolean[] vis = new boolean[V];
		
		dfs(graph, vis, 0);
		System.out.println();

		boolean[] visited = new boolean[V];
		dfsIteratively(graph, visited, 0);

	}

	public static void addEdge(ArrayList<ArrayList<Integer>> graph, int a, int b) {
		if (graph.get(a).contains(b))
			return;
		graph.get(a).add(b);
		graph.get(b).add(a);
	}

	public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int cur) {
		vis[cur] = true;
		System.out.print(cur + " ");
		for (int neighbor : graph.get(cur)) {
			if (!vis[neighbor]) {
				dfs(graph, vis, neighbor);
			}
		}

	}

	public static void dfsIteratively(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int cur) {
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(cur);
		vis[cur] = true;
		
		while (!stack.isEmpty()) {
			int a = stack.pop();
			System.out.print(a + " " );
			for (int neighbor : graph.get(a)) {
				if (!vis[neighbor]) {
					stack.push(neighbor);
					vis[neighbor] = true;
				}
			}
		}

	}

}
