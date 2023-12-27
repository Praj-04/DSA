package com.dsa.kk.recursion;

public class Sum {

	public static void main(String[] args) {
int[] a= {1,2,4,6,2,4,9,2,1,6,1,6,1,9,1,6,1,9,1}; //10
System.out.println(findAns(a));
	}

	private static int findAns(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==6) {
				while(a[i]!=9) {
					i++;
				}
			}else {
				sum+=a[i];
			}
		}
		return sum;
	}

}
