package com.week14.recorded.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArrayWithIndicesRetured {

	public static void main(String[] args) {
		int a[]= {1,4,-5,2,3,-3};
		 withIndices(a);
		
	}

//	public static ArrayList<Integer> withIndices(int [] a){
	public static void withIndices(int [] a){
	
		Map<Integer,ArrayList<Integer>> map=new  HashMap<>();
	ArrayList<Integer> num= new ArrayList<>();
		int cs=0;
		map.put(0, new ArrayList<>());
		map.get(0).add(1);
		
		
		for(int i=0;i<a.length;i++) {
			cs+=a[i];
			if(!map.containsKey(cs)){
				num.add(i+1);
			map.put(cs, new ArrayList<Integer>(num));
//			map.get(cs).add(i+1);
			}else {
				map.get(cs).add(i+1);
			}
		}
		
		
		
//		return num;
//		for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
//			System.out.println(entry.getKey()+ " "+entry.getValue());
//		}
//		
		
	}
}
