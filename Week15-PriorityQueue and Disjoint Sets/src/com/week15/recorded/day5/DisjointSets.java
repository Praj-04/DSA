package com.week15.recorded.day5;

public class DisjointSets {

	int p[];
	int r[];
	int n;
	int count;
	
	public DisjointSets(int n) {
		this.n= n;
		p= new int[n];
		r= new int[n];
		count=n;
		// initially  each element's parent is the element itself
		for(int i=0;i<n;i++) {
			p[i]=i;
			r[i]=1;
		}
	}
	
	//finding the parent of each elemet
	public int find(int a) {
		if(p[a]!=a) { // if the parent of an elemt isnot itself,then go above..we are doing recursive function here
//			return find(p[a]);    
			int root= find(p[a]); // optimized code by path compression
			p[a] = root;
			return root;
			
		}
		return a; // returning the root node
		
	}
	
	public void union(int a, int b) {
		int ra = find(a);
		int rb = find(b);
		
		//if ra and rb are not equal..ie they are both from different sets..we need to combine and make a new root node
		if(ra!=rb) {
			count--;
		//	p[ra]=rb; // making parent of rb as the parent of ra set also
			if(r[ra] > r[rb]) { // check whose rank is greater..make the one with higher rank as parent
				p[rb]=ra;
			}else if(r[ra] < r[rb]) {
				p[ra]=rb;
			}else {
				p[ra]=rb;
				r[rb]++;  
			}
		}
	}

}
