package com.week11.assignment;

public class SortedPermutationRank2 {

	public static void main(String[] args) {
		String A = "bca";
		int ans = firstRank(A);
		System.out.println(ans);

	}
	
	
	
	static long fact(int n) {
		long f=1;
		for(int i=2;i<=n;i++) {
			f=(f*i)%1000003;
		}
		return f;
	}

	
//	approach explanation ==> https://www.youtube.com/watch?v=KbSFlG7Y-AQ
	private static int firstRank(String A) {
		
		int n= A.length();
		long mod= 1000003;
		long ans=1;
		for(int i=0;i<n;i++) {
			long less_than=0;
			for(int j=i+1;j<n;j++) {
				if((int )A.charAt(i)>(int) A.charAt(j)) {
					less_than+=1;
				}
			}
			
			long permutation = (fact(n-i-1))%mod;
			long total_permutation = (less_than* permutation)%mod;
			ans=(ans+total_permutation)%mod;
		}
		return (int) ans;
		
	}

	
	
}
