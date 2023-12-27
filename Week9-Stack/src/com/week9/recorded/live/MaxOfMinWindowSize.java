package com.week9.recorded.live;
import java.util.*;

public class MaxOfMinWindowSize {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,50,10,70,30};
int n=arr.length;
int[] ans= maxOfMin(arr, n);
System.out.println(Arrays.toString(ans));
	}

    public static int[] maxOfMin(int[] arr, int n) {
        //You can code here

int[] left = smallerFromLeft(arr);

int[] right= smallestFromRight(arr);

int ans[] = new int[n];
Arrays.fill(ans,Integer.MIN_VALUE);

for(int i=0;i<n;i++){
  //here window length points to index ans array.. corresping i , check the element 
  int windowLength= right[i]-left[i]-1; 
  //initially takes value from arr[i] and puts in ans[windowLength-1]. If value already present,checks the max of already present value and current arr[i] value
ans[windowLength-1] = Math.max(arr[i],ans[windowLength-1]);
}

//fill the remaining index by checking the max from the end
for(int i=n-2;i>=0;i--){
  ans[i]= Math.max(ans[i+1],ans[i]);
}
return ans;
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