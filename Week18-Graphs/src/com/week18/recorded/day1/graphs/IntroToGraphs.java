package com.week18.recorded.day1.graphs;

import java.util.ArrayList;

public class IntroToGraphs {

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

		// matrix
//		int[][] graphMat = new int[V][V];
//		
//		addEdgeMat(graphMat, 0, 1);
//		addEdgeMat(graphMat, 0, 2);
//		addEdgeMat(graphMat, 0, 3);
//		addEdgeMat(graphMat, 1, 2);

	}

	static void addEdge(ArrayList<ArrayList<Integer>> graph, int a, int b) {
		if (graph.get(a).contains(b))
			return;
		graph.get(a).add(b);
		graph.get(b).add(a);// for unidirection we should not add this
	}

	static void addEdgeMat(int graphMat[][], int a, int b) { // incase weight is given add int w
		graphMat[a][b] = 1; // set w instead of 1 if weighted graph is given
		graphMat[b][a] = 1;// set w instead of 1 if weighted graph is given

	}

}
