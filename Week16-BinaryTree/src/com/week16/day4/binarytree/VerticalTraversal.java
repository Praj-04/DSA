package com.week16.day4.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalTraversal {

	static class Pair { // when we insert into queue i will store( hd,node)
		int horizontalDistance;
		Node node;

		public Pair(int horizontalDistance, Node node) {
			super();
			this.horizontalDistance = horizontalDistance;
			this.node = node;
		}

	}

	static ArrayList<ArrayList<Integer>> verticalOrderTraversal(Node root) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
		
		//here we are doing level order traversal(BFS)
		//add the root
		q.add(new Pair(0,root));
		
		while(!q.isEmpty()) {
			Pair cur = q.poll();
			if(!map.containsKey(cur.horizontalDistance)) {
				map.put(cur.horizontalDistance,new ArrayList<>());
			}
			map.get(cur.horizontalDistance).add(cur.node.data);
			
			if(cur.node.left!=null)
				{
				q.add(new Pair(cur.horizontalDistance-1,cur.node.left));
				}
			
			if(cur.node.right!=null) {
				q.add(new Pair(cur.horizontalDistance+1,cur.node.right));
			}
		}
		return new ArrayList(map.values());
	}
	
	static List<List<Integer>>verticalTraversal(Node root) {
		List<List<Integer>> ans = new ArrayList<>();
		Queue<Pair> q = new LinkedList<>();
		TreeMap<Integer,List<Integer> > map= new TreeMap<>();

		q.add(new Pair(0,root));

		while(!q.isEmpty()){
		Pair cur = q.poll();

		if(!map.containsKey(cur.horizontalDistance)){
		  map.put(cur.horizontalDistance,new ArrayList<>());
		  
		}

		map.get(cur.horizontalDistance).add(cur.node.data);

		if(cur.node.left!=null) {
		  q.add(new Pair(cur.horizontalDistance-1,cur.node.left));
		}
		if(cur.node.right!=null) {
			q.add(new Pair(cur.horizontalDistance+1,cur.node.right));
		}
    }
		for(List<Integer> vals: map.values()) {
			ans.add(vals);
		}

		return ans;

}
}