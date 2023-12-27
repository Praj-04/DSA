package com.week14.recorded.day2;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInArray  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,20,30,10,40,30};
		countFrquency(a);
	}

	public static void countFrquency(int[] a) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int e:a) {
			if(map.containsKey(e)) {
				map.put(e, map.get(e)+1);
			}else {
				map.put(e, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}
	
}
