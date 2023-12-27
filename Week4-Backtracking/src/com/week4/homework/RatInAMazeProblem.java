package com.week4.homework;

import java.util.ArrayList;

public class RatInAMazeProblem {

	public static void main(String[] args) {
		int n=3;
//		int arr[][] = { 
//				{ 0,0, 0, 0 },
//				{ 1, 1, 0, 1 }, 
//				{ 1, 1, 0, 0 },
//				{ 0, 1, 1, 1 }
//				};
		
		
		int arr[][] = { 
				{ 1,1, 1 },
				{ 1, 1, 1 }, 
				{ 1, 1, 1}
				};
		
		ArrayList<String> result = findPath(arr,n);
		
		for (int i=0; i<result.size(); i++) {
			 
			 System.out.println( result.get(i));

			  
			}
		
	}
	
	

	    public static ArrayList < String > findPath(int[][] arr, int n) {
	      
	      int m=n;
	      boolean[][] vis= new boolean[n][m];
	      vis[0][0]=true;
	      ArrayList<String> ans = new ArrayList<>();
	      String path="";
	   
	    		  helperMethod(arr,vis,0,0,n,m, path,ans);
	    		  return ans;
	    }


	  static boolean isValidPath(int[][] arr,boolean[][] vis,int i,int j,int n,int m){
		  
		  	    if(i<n && i>=0 && j<m && j>=0 && arr[i][j]==1 && !vis[i][j]){
	      return true;
	    }
	    return false;
	  }

	  
	  static void helperMethod(int[][] arr, boolean[][] vis,int i,int j, int n,int m,String path, ArrayList<String> ans)
	  {
		  
		//if 1st value itself ifor i anj is 0..then cant move further..returns empty.
			if(arr[i][j] == 0) return;

	    if(i==n-1 && j==m-1){
	      ans.add(path);
	      return ;
	    }

	//follow DLRU
	    if(isValidPath(arr,vis,i+1,j,n,m)){
	      vis[i+1][j]=true;
	      helperMethod(arr,vis,i+1,j,n,m, path+"D",ans);
	      vis[i+1][j]=false;
	    }
	    
	if(isValidPath(arr,vis,i,j-1,n,m)){
	  vis[i][j-1] = true;
	   helperMethod(arr,vis,i,j-1,n,m, path+"L",ans);
	  vis[i][j-1] = false;
	}

	if(isValidPath(arr,vis,i,j+1,n,m)){
	  vis[i][j+1] = true;
	   helperMethod(arr,vis,i,j+1,n,m,path+"R",ans);
	  vis[i][j+1] = false;
	}


	    if(isValidPath(arr,vis,i-1,j,n,m)){
	  vis[i-1][j] = true;
	   helperMethod(arr,vis,i-1,j,n,m,path+"U",ans);
	  vis[i-1][j] = false;
	}

	    
	    

	    
	  }
}
	
