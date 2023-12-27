package com.week11.assignment;

import java.util.ArrayList;
import java.util.List;

public class LowestXORValue {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		A.add(9);
		A.add(5);
		A.add(3);
		int ans=findMinXor(A);
		System.out.println(ans);
		
	}

	public static int findMinXor(List<Integer> A)
    {
        //You can code here
int n=A.size();
        int result=0;
        int min=Integer.MAX_VALUE;

for(int i=0;i<n;i++){
  for(int j=i+1;j<n;j++){
    
result=(A.get(i))^ (A.get(j));
min=Math.min(min,result);

}
}
return min;

    }
	
}
