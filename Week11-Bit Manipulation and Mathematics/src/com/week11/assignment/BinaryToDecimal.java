package com.week11.assignment;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1111";
		System.out.println(toDecimal(str));
	}

	public static int toDecimal(String str) {
		double ans = 0;
		System.out.println("length of str " + str.length());

		for (int i =0; i <str.length(); i++) {

			System.out.println(str.charAt(i));
			if (str.charAt(str.length()-1-i) == '0') {
				System.out.println(" i is : no adding " + str.charAt(i));
				continue;

			} else if (str.charAt(str.length()-1-i) == '1') {
				System.out.println(" ith position  is :" + str.charAt(i));
				ans += Math.pow(2, i);
				System.out.println(ans);

			}
		}
		return (int) ans;
	}

}
