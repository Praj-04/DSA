//package com.week14.assignment.homework;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class TotalAppealOfAString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String s="mluoeqzxpz"
//		;
//System.out.println(appealSum(s));
//	}
//	
//	 public static long appealSum(String s) {
//	        //You can code here
//		
//
//	long ans=0;
//	int count=0;
//	
//	for(int i=0;i<=s.length();i++){
//		Map<Character,Integer> map=new HashMap<>();
//	 for(int j=i;j<=s.length()-(s.length()-i);j++){
//		 
//		 for(int k=0;k<s.length();k++) {
//				if(map.containsKey(substring.charAt(i))) {
//					count+=0;
//				}else {
//					map.put(substring.charAt(i), 1);
//					count+=1;
//				}
//		 if(map.containsKey(j)) 
//		 
//	count= findCount(s.substring(j,j+i));
//	ans+=count;
//	 }
//	}
//	return ans;
//
//
//	        
//	    }
//
//	private static int findCount(String substring) {
//		Map<Character,Integer> map=new HashMap<>();
//		int count=0;
//		for(int i=0;i<substring.length();i++) {
//			if(map.containsKey(substring.charAt(i))) {
//				count+=0;
//			}else {
//				map.put(substring.charAt(i), 1);
//				count+=1;
//			}
//			
//		}
//		return count;
//	}
//
//}
//
//
//
///*
//public long appealSum(String s) {
//long appealSum = 0;
//if (s != null && !s.isEmpty()) {
//    HashMap<Character, Integer> lastIndex = new HashMap();
//    for (int i=0; i<s.length(); i++) {
//        char ch = s.charAt(i);
//        int last = lastIndex.get(ch) != null ? lastIndex.get(ch) : -1;
//        appealSum += (s.length()-i) * (i-last);
//        lastIndex.put(ch, i);
//    }
//}
//
//return appealSum;
//}
//}
//*/