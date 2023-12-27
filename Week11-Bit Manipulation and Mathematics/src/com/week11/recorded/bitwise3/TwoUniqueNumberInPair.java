package com.week11.recorded.bitwise3;

public class TwoUniqueNumberInPair {

	public static void main(String[] args) {
int[] arr= {2,5,4,1,3,2,5,1};
int[] ans=TwoUniqueNumbersingleNumber(arr);

for(int i:ans) {
	System.out.print(i+" ");
}
}

public static int[] TwoUniqueNumbersingleNumber(int[] arr)
{

	int xor=0;
	for(int i:arr) {
		xor=xor^i;
	}
	
	int mask=xor & (-xor);
	
	int firstNumber=0;
	
	for(int e:arr) {
		if((mask&e)==0) {
			firstNumber=firstNumber^e;
		}
	}
	int secondNumber=xor^firstNumber;
	int ans[]=new int[2];
	ans[0]=firstNumber;
	ans[1]=secondNumber;
	return ans;
	
}

}
