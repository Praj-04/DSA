package com.week7.assignment.arrays1;

public class maxSortedChunks1 {

	public static void main(String[] args) {
		int arr[]= {3,4,5,2,0,1,6};
		
	int chunks=	maxChunk(arr);
	System.out.println(chunks);
	}

	private static int maxChunk(int[] a) {

		if(a.length==0) return 0;
		
		int chunks=0;
		int maxSoFar=a[0];
		
		for(int i=0;i<a.length;i++) {
			maxSoFar = Math.max(maxSoFar, a[i]);
			if(i==maxSoFar) {
				chunks++;
			}
		}
		
		
		return chunks;
	}

}
