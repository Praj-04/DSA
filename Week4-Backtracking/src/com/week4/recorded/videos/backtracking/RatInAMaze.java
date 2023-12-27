package com.week4.recorded.videos.backtracking;

public class RatInAMaze {

	public static void main(String[] args) {

		int mat[][] = { 
				{ 0, 1, 1, 0 },
				{ 1, 1, 0, 1 }, 
				{ 1, 1, 0, 0 },
				{ 1, 1, 1, 1 }
				};

		int n = mat.length; // 4 rows
		int m = mat[0].length; // 4 columns
		
		boolean vis[][]= new boolean[n][m];
		vis[0][0]=true;
		ratInAMaze(mat, vis, 0, 0, "", n, m);
	}
	
	
	//Checks if its valid position to move..i and j should not go outside the matrix position, matrix value should be 1 and also it should not be already visited..
	//ony then its a valid path
	static boolean isValid(int i,int j,int mat[][],boolean vis[][],int n,int m) {
	if(i<n && i>=0 && j<m && j>=0 && mat[i][j]==1 && !vis[i][j]) {
		return true;
	}
	return false;
		
	}
	
	
	//take the input matrix,matrix to maintain visited path,i is pointer to row,j pointer to column,path is the path we traversed,
	// n and m are length of row and column on given matrix	
	static void ratInAMaze(int mat[][],boolean vis[][],int i,int j,String path,int n,int m) { 
		
		//if 1st value itself  for i and j is 0..then cant move further..returns empty.
		if(mat[i][j] == 0) return;
		
		//base case - check if you reached end of matrix,print path and return
		if(i==n-1 && j==m-1) {
			System.out.println(path);
			return;
		}
	
		
	//Directions D-> L -> R-> U	
		
		//D
	if(isValid(i+1, j, mat, vis, n, m))	{ //i+1 means going down
		vis[i+1][j]=true;
//		path=path+'D';
		ratInAMaze(mat, vis, i+1, j, path+'D', n, m);
		vis[i+1][j]=false;
			}
		
	
	//L
	if(isValid(i, j-1, mat, vis, n, m)) {
		vis[i][j-1]=true;
		ratInAMaze(mat, vis, i, j-1, path+'L', n, m);
		vis[i][j-1]=false;
	}
	
	
	//R
	if(isValid(i, j+1, mat, vis, n, m)) {
			vis[i][j+1]=true;
			ratInAMaze(mat, vis, i, j+1, path+'R', n, m);
			vis[i][j+1]=false;
		}
	
	
	//U
		if(isValid(i-1, j, mat, vis, n, m)) {
				vis[i-1][j]=true;
				ratInAMaze(mat, vis, i-1, j, path+'U', n, m);
				vis[i-1][j]=false;
			}
		
	
	
		
		
	}
	
	

}
