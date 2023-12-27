package com.week4.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequencesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = { 1,1,1};
ArrayList<ArrayList<Integer>> anss= subsequences(a);
for(ArrayList<Integer> ans: anss) {
	System.out.println(ans);
}

	}
	
	
	static ArrayList<ArrayList<Integer>> subsequences(int a[]) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		 Arrays.sort(a);
		helper(a, ans, 0, new ArrayList<>());
		return ans;
	}
	
	
	
	
	static void helper(int a[], ArrayList<ArrayList<Integer>> ans,int index,ArrayList<Integer> cur ) {
	
		ArrayList<Integer> curCopy=new ArrayList<>(cur);
		ans.add(curCopy);
	
			
	for(int i=index;i<a.length;i++) {
		if (i > index && a[i] == a[i - 1]) {
            continue; // Skip duplicate elements
        }
		cur.add(a[i]);
		helper(a,ans,i+1,cur);
		cur.remove(cur.size()-1);// backtrack
	}
		
		
	}
	

}


//int num[] = new int[nums.size()];  //converting arrayLIst to array
//for(int i =0; i<nums.size(); i++)
//{
//num[i]= nums.get(i);
//}
 