package com.week13.recorded.day4.activityselection.minnoofplatform;

import java.util.Arrays;

public class MinNoOfPlatforms {

	public static void main(String[] args) {
		int s[] = {5,10,20,40,45,7};
		int f[] = {15,25,35,42,55,70};
		System.out.println(minPlatform(s, f));
	}
	
	public static int minPlatform(int arr[],int dep[] )
	{
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int count=0;int i=0;int j=0;
		int maxCount=0;
		
		while(i<arr.length) {
			if(arr[i]<=dep[j]) {
				count++;
				maxCount=Math.max(maxCount, count);
				i++;
				
			}else {
				count--;
				j++;
				
			}
		}
		
		return maxCount;
	}

}
