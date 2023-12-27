package com.week11.recorded.Mathematics2;

public class Mathematics2 {
	static int m = (int) (1e9 + 7);

	public static void main(String[] args) {
//		int n = -1;

//		System.out.println(n % 3);
//		System.out.println(fastPowerm(2, 4));
		System.out.println(ncrm(5,3));
		
	}

	static int ncrm(int n,int r)
	{
		return mulm(mulm(factorial(n),inv(factorial (n-r))),inv(factorial(r)));
	}
	static int factorial(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res=mulm(res,i);
		}
		return res;
		
	}
	
	static int inv(int a) {
		return fastPowerm(a, m-2);
	}
	
	
	static int divm(int a , int b)
	{
//		return (a%m * fastPowerm(b,m-2)%m)%m;
		//can also be written as  ==>  return mulm(a,fastPowerm(b,m-2));
		return mulm(a,inv(b));
		
	}
	
	
	static int fastPowerm(int a,int b) {
		int res=1;
		while(b>0) {
			if((b&1) !=0) { //if b is odd
				//res = (res % m * a%m)%m; //or can be written as 
				 res=mulm(res,a);
			}
			
			a= mulm(a,a); // a2 for even
			b=b>>1; //  b/2
		}
		return res;
	}
	
	
	static int addm(int a, int b) {
		return (a % m + b % m) % m;
	}

	static int mulm(int a, int b) {
		return (int) ((long)a % m * (long)b % m) % m;
	}
	
	static int subm(int a,int b) {
		return (a%m - b%m + m)%m;
		}

}
