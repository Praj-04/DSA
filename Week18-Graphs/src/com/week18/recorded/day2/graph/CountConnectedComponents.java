package com.week18.recorded.day2.graph;

import java.util.ArrayList;

public class CountConnectedComponents {

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
		
		addEdge(graph, 7, 4);
		
		addEdge(graph, 6, 3);
		
		int countComponent=noOfComponents(graph, V);
		System.out.println(countComponent);

	}

	
	public static void addEdge(ArrayList<ArrayList<Integer>> graph, int a, int b) {
		if (graph.get(a).contains(b))
			return;
		graph.get(a).add(b);
		graph.get(b).add(a);
	}

	public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int cur) {
		vis[cur] = true;
//		System.out.print(cur + " ");
		for (int neighbor : graph.get(cur)) {
			if (!vis[neighbor]) {
				dfs(graph, vis, neighbor);
			}
		}

	}
	
	public static int noOfComponents(ArrayList<ArrayList<Integer>> graph, int V) {
		boolean[] visited = new boolean[V];
		int count=0;
		
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				count++;
				dfs(graph,visited,i);
			}
		}
		return count;
		
		
		
	}
}
