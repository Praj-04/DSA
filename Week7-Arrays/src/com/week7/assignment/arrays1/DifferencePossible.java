package com.week7.assignment.arrays1;

public class DifferencePossible {

	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 2, 2, 6, 8, 8, 8};
		int	k = 2;
//		int arr[] = {1, 4, 5, 8, 10, 14, 18};
//		int k=5;
			
 System.out.println(diffPossible(arr,k)); 
	}
	
	public static boolean diffPossible(int[] arr, int k)
    {
       for(int i=arr.length-1;i>0;i--){
         for(int j=i-1;j>=0;j--){
           if(arr[i]-arr[j]==k){
             return true;
           }
         }
       }
      return false;


      
    
    }

}
