package com.week12.recorded.treecutter.cowday4;

public class TreeCutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {47,40,21,43,33,25,7,25,40,29,16,11,3,4,42};
		int k=25;
//int a[] = {1,12,28,24,8,4,10,33,28,18,5,15,19,31,34,17};
//int k=17;
System.out.println(woodCutter(a,k));
	}

	private static int woodCutter(int[] a, int k) {
		
		int l=0; int r = (int)1e9;
		
		while(l<=r) {
			
			int m=l+(r-l)/2;
			System.out.println(l+ " "+ m+ " "+r);
						
			int totalWoodLength = getWoodAtCut(a,m);
			if(totalWoodLength == k) return m;
			
			if(totalWoodLength > k) {
				l=m+1;
			}
			else {
				r=m-1;
			}
			
		}
		
		
		return r;
	}

	private static int getWoodAtCut(int[] a, int cut) {
		int ans=0;
		for(int e:a) {
			ans+= e>cut? e-cut : 0;
		}
		System.out.println("total wood" +ans);
		return ans;
	}

	
	
}
