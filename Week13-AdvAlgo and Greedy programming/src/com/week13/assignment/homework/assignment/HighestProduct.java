package com.week13.assignment.homework.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestProduct {

	public static void main(String[] args) {
		
//		List<Integer> l = List.of(1,2,3,4);
		List<Integer> l = List.of(-33 ,33, -54, 3 ,49, 18, 26, 28, 6 ,68);
		ArrayList<Integer> A = new ArrayList<>(l);
	System.out.println(maxProduct3(A));
		
	}
	
	public  static int maxProduct3(ArrayList<Integer> A) {
        //You can code here
		
		
		Collections.sort(A);
		
		return Math.max((A.get(0)*A.get(1)*A.get(A.size()-1)),A.get(A.size()-1)*A.get(A.size()-2)*A.get(A.size()-3));
		
		
//Collections.sort(A,(o1,o2)->{
//	return o2-o1;
//});
//System.out.println(A);
//int sum=1;
//for(int i=0;i<3;i++) {
//	sum*=A.get(i);
//}
//
//		return sum;

        
    }

}
