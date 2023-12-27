package com.week7.assignment.arrays1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class find123 {

	public static void main(String[] args) {
int[] arr = {21322233, 123, 89, 32, 11,21322122};

//8
//123 21322122 213321 21311333 96 213 68 21322233

List<Integer> ans = new ArrayList<>();
Arrays.sort(arr);
 for(int i : arr){
  String a = Integer.toString(i);
  if(a.contains("1")&& a.contains("2")&& a.contains("3"))
  {
    ans.add(i);
    
  } 
 }

 if(ans.isEmpty()) {
	 System.out.println(-1);
 }else {
	 System.out.println( ans); 
 }
 


}
}
