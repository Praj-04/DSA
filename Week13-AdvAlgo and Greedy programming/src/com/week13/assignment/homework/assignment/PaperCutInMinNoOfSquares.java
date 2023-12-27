package com.week13.assignment.homework.assignment;

public class PaperCutInMinNoOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int M=4;
//int N=5;

int M=9;
int N=15;
System.out.println(findMinNOfPaperCut(M, N));
	}
	
	public static int findMinNOfPaperCut(int M,int N)
	{
		int squares=0;

		while(M!=0 &&  N!=0){
		    if(N>=M){
		N=N-M;
		squares++;
		    }
		    else{
		M=M-N; 
		squares++;
		    }
		}

		return squares;

	}
}
