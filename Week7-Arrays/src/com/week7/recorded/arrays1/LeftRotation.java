package com.week7.recorded.arrays1;

public class LeftRotation {

	public static void main(String[] args) {
  
		int a[] = {1,2,3,4,5};
		
//		int b[] = {2,3};
		int[] b = {2};
		
		int ans[][] = multipleRotations(a,b);
		
		for(int e[]: ans)
		
		prinatArray(e);
		
	}
	
	
	
	private static void prinatArray(int[] e) {
for(int a:e) {
	System.out.print(a+ " ");
}
System.out.println();
	}



	static int[][] multipleRotations(int a[],int b[]) {
		int n= a.length;
		int m= b.length;
		
		int  ans[][] = new int[m][n];
		
		
		int[] temp = new int[2*n];
		
		for(int i=0;i<n;i++) {
			temp[i] = a[i];
			temp[i+n]=a[i];
		}
		
		
		for(int i=0;i<m;i++) {
			
			int offset = b[i]%n; // we did % n incase the no of rotations is very large
					
			// int offset = n- b[i]%n;  for right rotation ..use same code..just this 1 small change
			for(int j=0;j<n;j++) {
			ans[i][j] = temp[j+offset];	
			}
		}
		
		return ans;
		
	}
	

}
