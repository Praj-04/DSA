package com.week11.assignment;

public class UniqueNumberinArray {

	public static void main(String[] args) {

		int[] arr= {2,5,1,3,2,5,1};
		System.out.println(singleNumber(arr));
	}
	
	public static int singleNumber(int[] arr)
    {
        //You can code here
int xor=0;
for(int i=0;i<arr.length;i++){
xor=xor^arr[i];
}
return xor;
      
    }

}
