package com.week7.assignment.arrays1;

import java.util.Arrays;
import java.util.Vector;

public class MissingAndRepeatingNumber {

	public static void main(String[] args) {

		int [] arr= {1, 1, 2, 3, 4, 6};
//		int [] arr= {1,1};
//		int [] arr= {4, 2, 3,2};
		Vector<Integer> ans =  findNumbers(arr);
		System.out.println(ans);
	}
	
	public static Vector<Integer> findNumbers(int[] a)
    {
		  Vector<Integer> newValue= new Vector<>();
		   
		  int[] b = new int[a.length];
		  for (int i = 0; i < a.length; i++)
		  {
		      b[i] = a[i];
		  }
		  Arrays.sort(b);

		  System.out.println(Arrays.toString(b));
		        int n=b.length;
		        int val=1;




		        
		  for(int j=0;j<n-1;j++){
		    if(b[0]!=val){
//		  	  System.out.println(val);
		     newValue.add(val);
		         break;
		    }else if(b[j+1]-b[j]>1){
		      val=b[j]+1;
		      newValue.add(val);
		      break;
		    }
		     
		    }

		    if(b[n-1]!=n){
		      val=n;
		      newValue.add(val);
		      // break;
		    }
		        
		        for(int i=0;i<n-1;i++){
		          if(b[i+1]-b[i]==0){
		            newValue.add(b[i]);
		            break;
		          }
		        }
		        
		        return newValue;
    }
}
