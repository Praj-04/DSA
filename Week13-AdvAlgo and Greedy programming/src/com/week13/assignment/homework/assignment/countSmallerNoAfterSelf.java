package com.week13.assignment.homework.assignment;

//solution video available on youtube
public class countSmallerNoAfterSelf {
 static int count[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 6, -9, 5, 18, -5, 7 };
		int[] ans = countSmall(nums);

		for (int e : ans) {
			System.out.print(e + " ");
		}
	}

	public static int[] countSmall(int[] nums) {
		int[] ans = new int[nums.length];
		 count = new int[nums.length];
		int[] originalIndex = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			originalIndex[i] = i;
					}

		sort(nums, originalIndex, 0, nums.length - 1);

		for (int i = 0; i < nums.length; i++) {
			ans[i] = count[i];
		}

		return ans;

	}

	private static void sort(int[] nums, int[] originalIndex, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(nums, originalIndex, l, mid);
			sort(nums, originalIndex, mid + 1, r);
			merge(nums, originalIndex, l, mid, r);
		}
	}

	private static void merge(int[] nums, int[] originalIndex, int l, int mid, int r) {
		int leftArraySize = mid - l + 1;
		int rightArraySize = r - mid;

		int[] leftArray = new int[leftArraySize];
		int[] rightArray = new int[rightArraySize];

		for(int i=0;i<leftArraySize;i++) {
			leftArray[i]=originalIndex[l+i];
		}
		
		for(int i=0;i<rightArraySize;i++) {
			rightArray[i]=originalIndex[i+mid+1];
		}
		
		int i=0,j=0,k=l,rightCount=0;
		
		while(i<leftArraySize && j< rightArraySize) {
			if(nums[leftArray[i]]<=nums[rightArray[j]]) {
				originalIndex[k]=leftArray[i];
				count[leftArray[i]]+=rightCount;
				i++;
			}else {
				originalIndex[k]=rightArray[j];
				rightCount++;
				j++;
			}
			k++;
		}
		
		while(i<leftArraySize) {
			originalIndex[k]=leftArray[i];
			count[leftArray[i]]+=rightCount;
			i++;
			k++;
		}
		
		while(j<rightArraySize) {
			originalIndex[k]= rightArray[j];
			j++;
			k++;
		}
		
	}

}

//You Can Code Here
//NAIVE APPROACH  => O(N2)
//   int[] counts = new int[nums.length];
//
//int n=nums.length;
//
//for(int i=0;i<n;i++){
//	int count=0;
// for (int j=i+1;j<n;j++){
// 	System.out.println(nums[i]+ " " +nums[j]);
// if(nums[j]<nums[i]){
//   count++;
//   System.out.println(count);
//   System.out.println();
// }
//}
//counts[i]=count;
//}
//
//return counts;
