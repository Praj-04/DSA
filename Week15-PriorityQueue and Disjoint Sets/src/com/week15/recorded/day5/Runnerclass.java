package com.week15.recorded.day5;

public class Runnerclass {

	public static void main(String[] args) {
		
	int n=8;
DisjointSets ds=new DisjointSets(n);
ds.union(0,3);
ds.union(1,3);
ds.union(5,4);
ds.union(1,3);
ds.union(0,1);

System.out.println(ds.count);
	}

}
