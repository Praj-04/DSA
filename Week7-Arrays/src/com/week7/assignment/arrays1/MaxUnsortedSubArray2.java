package com.week7.assignment.arrays1;

import java.util.ArrayList;
import java.util.List;

public class MaxUnsortedSubArray2 {

	public static void main(String[] args) {

		//ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 2, 4, 5));
		//ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		
//		ArrayList<Integer> A = new ArrayList<>(List.of(4, 3, 2, 5, 1));
	 ArrayList<Integer> A = new ArrayList<>(List.of(229462, 879748, 524108, 109767, 416718, 58019, 469065, 89537, 651016, 913512 ,398017 ,57475 ,836393 ,857686 ,712427, 276823 ,803826, 905589,5,1,3));
//		18
//
//		229462, 879748, 524108, 109767, 416718, 58019, 469065, 89537, 651016, 913512 ,398017 ,57475 ,836393 ,857686 ,712427, 276823 ,803826, 905589

		System.out.println(subUnsort(A));

	}

	public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<>();

		boolean value = isSorted(A);
		if (value) {
			ans.add(Integer.valueOf(-1));
			return ans;
		}
		
		if(A.size()<3 && isSorted(A)) {
			ans.add(Integer.valueOf(-1));
			return ans;
		}

		for (int i = 0; i < A.size() - 1; i++) {
			if (A.get(i + 1) - A.get(i) < 1) {
				ans.add(i);
				break;
			}
		}

		for (int j = A.size() - 1; j > 0; j--) {
			if (A.get(j) - A.get(j - 1) < 1) {
				ans.add(j);
				break;
			}
		}

		return ans;

	}

	private static boolean isSorted(ArrayList<Integer> a) {
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i + 1) - a.get(i) < 1) {
				return false;
			}
		}
		return true;
	}

}

//
//public class Solution {
//    public int[] subUnsort(int[] A) {
//        int arr[] = new int[A.length];
//        for(int i = 0; i<A.length; i++){
//            arr[i] = A[i];
//        }
//        Arrays.sort(arr);
//        int ans[];
//        int start = -1, end = -1;
//        for(int i = 0; i<A.length; i++){
//            if(arr[i]!=A[i]){
//                start = i;
//                break;
//            }
//        }
//        for(int i = A.length-1; i>=0; i--){
//            if(arr[i]!=A[i]){
//                end = i;
//                break;
//            }
//        }
//        if(start == -1 && end == -1){
//            ans = new int[1];
//            ans[0] = -1;
//            return ans;
//        }else{
//            ans = new int[2];
//            ans[0] = start;
//            ans[1] = end;
//            return ans;
//        }
//    }
//}





