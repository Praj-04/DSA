package com.week14.recorded.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuadrupleWithGivenSum {

	public static void main(String[] args) {
int a[]= {1,0,-1,0,-2,2};
int sum=0;
System.out.println(findAllQuadrupleWithGivenSum(a, sum));
	}

	
	static List<List<Integer>> findAllQuadrupleWithGivenSum(int a[],int k){
		if(a.length<3) return null; //we need 4 nos but only 3 nos given
		
		Set<List<Integer>> ans = new HashSet<>(); // we want unique so used hashset 
		
		Arrays.sort(a);
		int n=a.length;
		for(int i=0;i<n-3;i++) {
			for(int j=i+1;j<n-2;j++) {
				List<List<Integer>> temp=findAllTwoSum(a, k-a[i]-a[j], j+1);
					for(List<Integer> list :temp) {
						List<Integer> tempAns= new ArrayList<>();	
						tempAns.add(a[i]); //a
						tempAns.add(a[j]); //b
						tempAns.addAll(list); //c and d from here
						ans.add(tempAns);
					}
							}
		}
		return new ArrayList<>(ans);
		
	}
	
	static List<List<Integer>>  findAllTwoSum(int a[],int sum,int start){
		int i=start,j=a.length-1;
		List<List<Integer>> ans= new ArrayList<>();
		while(i<j) {
			
			if(a[i]+a[j]==sum) {
				List<Integer> temp= new ArrayList<>();
				temp.add(a[i]);
				temp.add(a[j]);
				ans.add(temp);
				i++;
				j--;
			}else if(a[i]+a[j]<sum) {
				i++;
			}else {
				j--;
			}
		}
		return ans;
	}
}
