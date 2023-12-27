package com.wek12.assignments;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] A = { {1,8},
		{21,24},
		{48,84}
};

int B=84;
System.out.println(searchMatrix(A, B));
		
	}
	
	
	public static int searchMatrix(int[][] A, int B) {
	      //You can code here


	  int i=0;
	  while(i<A.length){
	int l=0;
	    int r=A[0].length-1;
	System.out.println(l +" "+r);
	    while(l<=r){
	int m= l+(r-l)/2;

	if(A[i][m]==B) return 1 ; 

	if(A[i][m]<B){
	  l=m+1;
	}else{
	  r=m-1;
	}
	    }
	    i++;

	  }
	    return 0;
	  
	}

}
