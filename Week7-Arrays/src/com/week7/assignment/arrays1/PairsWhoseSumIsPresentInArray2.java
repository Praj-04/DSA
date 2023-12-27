package com.week7.assignment.arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//CORRECT CODE

public class PairsWhoseSumIsPresentInArray2 {

	public static void main(String[] args) {
		//int[] arr = {10, 4, 8, 13, 5}; 
		int[] arr = {1, 9 ,10, 8, 2, 2, 10, 7, 9, 1};
		
		List<List<Integer>> ans = findPair(arr);
		System.out.println(ans);

//		for (List<Integer> a : ans) {
//			for (int aa : a) {
//				System.out.println(aa);
//			}
//		}

	}

	private static List<List<Integer>> findPair(int[] arr) {

		 int n = arr.length;

	     List<Integer> s = new ArrayList<Integer>();
	       for (Integer i : arr) {
	            s.add(i);
	        }
	List<List<Integer>> whole = new ArrayList<>();
				

			for (int i = 0; i < n ; i++) {
				for (int j =i+1; j < n ; j++) {
	            
					int sum= arr[i]+arr[j];
	              if(s.contains(sum))
						{
							List<Integer> answer = new ArrayList<>();
							answer.add(arr[i]);
							answer.add(arr[j]);
							// System.out.println(answer);
							whole.add(answer);
						}
	            }
				}

	 whole.sort((x, y) -> {
	            int minLen = Math.min(x.size(), y.size());
	            for (int i = 0; i < minLen; i++) {
	                int cmp = x.get(i).compareTo(y.get(i));
	                if (cmp != 0) {
	                    return cmp;
	                }
	            }
	            return Integer.compare(x.size(), y.size());
	        });
	      return whole;
			

			


	

	}

}

