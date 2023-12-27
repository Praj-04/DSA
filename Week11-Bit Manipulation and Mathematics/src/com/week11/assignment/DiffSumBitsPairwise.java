package com.week11.assignment;

public class DiffSumBitsPairwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5	};
System.out.println(differentBitsSumPairwise(a));

	}
	
	static int differentBitsSumPairwise(int a[]) {
		int n=a.length;
		int ans=0;
		for(int i=0;i<32;i++) {
			int k=0;
			for(int e:a) {
				if((e&(1<<i)) !=0) {
					k++;
				}
			}
			ans+=k*(n-k)*2;
		}
		return ans;
	}

}
