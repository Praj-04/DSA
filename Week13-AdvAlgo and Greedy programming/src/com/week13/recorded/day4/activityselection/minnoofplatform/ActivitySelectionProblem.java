package com.week13.recorded.day4.activityselection.minnoofplatform;

import java.util.Arrays;

public class ActivitySelectionProblem {

	static class Activity{
	int start,finish;
	
	public Activity(int s,int f) {
		this.start=s;
		this.finish=f;
	}
	}
	
	
	public static void main(String[] args) {
int s[] = {10,12,20};
int f[] = {20,25,30};
System.out.println(activitySelection(s, f));

	}
	
	
	static int activitySelection ( int s[],int f[]) {
		int n=s.length;
		
		Activity[] activities = new Activity[n];
		
		for(int i=0;i<n;i++) {
			activities[i]= new Activity(s[i],f[i]);
						
		}
		
		
		Arrays.sort(activities,(o1,o2) ->{
			return o1.finish-o2.finish;
		});
		
		
		int count=1;
		int curFinish = activities[0].finish;
		
		for(int i=1;i<n;i++) {
			if(activities[i].start>=curFinish) {
				count++;
				curFinish=activities[i].finish;
			}
		}
		return count;
	}

}
