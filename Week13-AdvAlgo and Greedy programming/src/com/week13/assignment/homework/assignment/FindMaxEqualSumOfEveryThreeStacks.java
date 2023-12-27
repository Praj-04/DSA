package com.week13.assignment.homework.assignment;

public class FindMaxEqualSumOfEveryThreeStacks {

	public static void main(String[] args) {
		int N1=3,N2=4,N3=2;
		int[] s1= {4,2,3};
		int[] s2= {1,1,2,3};
		int[] s3= {1,4};
		System.out.println(maxEqualSum(N1, N2, N3, s1, s2, s3));
	}
	
	 public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
	  
		 int sum1=0,sum2=0,sum3=0;

	
			
			for(int i=0;i<N1;i++){
				sum1+=S1[i];
			}
			
			for(int i=0;i<N2;i++){
				sum2+=S2[i];
			}
			
			for(int i=0;i<N3;i++){
				sum3+=S3[i];
			}
			
	int top1=0,top2=0,top3=0;
	
	while(true) {
		if(top1==N1|| top2==N2||top3==N3) {
			return 0;
		}
		
		if(sum1==sum2 && sum2==sum3) {
			return sum1;
		}
			
		
		if(sum1>=sum2 && sum1 >=sum3) {
			sum1 = sum1- S1[top1];
			top1++;
			}
			
		else if(sum2>=sum1 && sum2>=sum3) {
			sum2=sum2-S2[top2];
			top2++;
		}
		else if(sum3>=sum1 && sum3>=sum2) {
			sum3=sum3-S3[top3];
			top3++;
		}
		
		}
		 

	
	
	

	    }

}
