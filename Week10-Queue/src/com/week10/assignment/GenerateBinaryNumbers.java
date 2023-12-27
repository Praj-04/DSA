package com.week10.assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GenerateBinaryNumbers {

	
	public static void main(String[] args) {
		
		int N=5;
		
		ArrayList<String> answer = generate(N);
		for(String s: answer) {
			System.out.print(s+ " ");
		}
	}

	private static ArrayList<String> generate(int N) {
		ArrayList<String> ans = new ArrayList<>();

		for(int i=1;i<=N;i++){
		ArrayDeque<String> q = new ArrayDeque<>();

		int val=i;
		while(val>0){
			
		  q.offer(Integer.toString(val%2));
		  val=val/2;
		  

		}
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()){
		  sb.append(q.pollLast());
		  }
		ans.add(sb.toString());

		}

		return ans;
	}
	
}
