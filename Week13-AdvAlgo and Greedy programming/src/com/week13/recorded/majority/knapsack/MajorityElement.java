package com.week13.recorded.majority.knapsack;

public class MajorityElement {

	public static void main(String[] args) {
int a[]= {3,2,4,2,4,4,4,2};
System.out.println(majorityElement(a));



	}
	
	//Moore's Voting Algorithm
	static int majorityElement(int a[]){
		int count=1;
		int majority = a[0];
		
		for(int i=1;i< a.length;i++) {
			if(a[i]== majority) {
				count++;
			}else {
				count--;
			}
			
			if(count==0) {
				majority =a[i];
				count=1;
			}
		}
		
		int freq=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==majority) {
				freq++;
			}
		}
		
		return freq> a.length/2 ? majority : -1;
	}

}
