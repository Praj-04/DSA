package com.week14.recorded.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndicesThatMakeSumZero {

	public static void main(String[] args) {
int a[]= {1,4,-5,2,3,-3};
int sum=0;
List<List<Integer>> ans=
findIndicesthatMakeSumZero(a,sum);

for(List<Integer> list:ans) {
	System.out.println(list);
}
	}

	private static List<List<Integer>> findIndicesthatMakeSumZero(int[] a, int sum) {
int start=0;
Map<Integer,Integer> map=new HashMap<>();
List<List<Integer>> answer=new ArrayList<>();
	int cs=0;	
for(int i=0;i<a.length;i++) {
	cs+=a[i];
	if(map.containsKey(cs)) {
		List<Integer> ans=new ArrayList<>();
		ans.add(map.get(cs));
		ans.add(i);
		answer.add(ans);
	}else {
		map.put(cs, i);
	}
}
return answer;

	}

}
