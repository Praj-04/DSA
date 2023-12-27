package com.week9.recorded.live;
import java.util.*;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		int[] heights= {2,1,5,6,2,3};
		int ans=largestRectangleArea(heights);
		System.out.println(ans);

	}
	
	
	public static int largestRectangleArea(int[] heights)
    {
        //You can code here

int[] left = smallerFromLeft(heights);
int[] right = smallestFromRight(heights);

int max=0;

for(int i=0;i<heights.length;i++){
int currentArea = (right[i]-left[i]-1 )*heights[i];
max=Math.max(max,currentArea);

}

return max;

      
    }


    static int[] smallerFromLeft(int[] arr){
  int n= arr.length;
  int[] ans = new int[n];
  ArrayDeque<Integer> stack = new ArrayDeque<>();

  for(int i=0;i<n;i++){

    while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
      stack.pop();
          }
          if(stack.isEmpty()){
            ans[i]=-1;
          }else{

        ans[i]=stack.peek();
          }
          stack.push(i);
  }
  return ans;
}


static int[] smallestFromRight(int[] arr){
  int n= arr.length;
  int[] ans = new int[n];
  ArrayDeque<Integer> stack = new ArrayDeque<>();

  for(int i=n-1;i>=0;i--){

    while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
      stack.pop();
          }
          if(stack.isEmpty()){
            ans[i]=n;
          }else{

        ans[i]=stack.peek();
          }
          stack.push(i);
  }
  return ans;
}

}
