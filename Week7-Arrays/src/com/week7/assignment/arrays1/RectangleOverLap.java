package com.week7.assignment.arrays1;

public class RectangleOverLap {

	public static void main(String[] args) {
		int[] rec1 = {1, 4, 2, 8};
		int[] rec2= {1, 3, 2, 4};
//		
//		int[] rec1 = {2, 4, 10, 8};
//		int[] rec2= {1, 2, 6, 6};

System.out.println( isRectangleOverlap(rec1,rec2));
		
	}
	
	public static boolean isRectangleOverlap(int[] rec1, int[] rec2)
    {
    if(rec1[1]>=rec2[3] || rec1[2]<=rec2[0] || rec1[3]<=rec2[1]|| rec1[0]>=rec2[2]) {
      return false;
    }
      return true;
    
    

  
    
  }

}
