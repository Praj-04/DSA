package com.week14.recorded.hashmap.hashset.intro.day1;

import java.util.Objects;

public class IntroToHashing {

	public static void main(String[] args) {
//String s ="C";
		String s ="AC";
System.out.println(s.hashCode());

Boolean a=true;
System.out.println(a.hashCode());


Integer i = 23;
System.out.println(i.hashCode());

Double d = 1.2;
System.out.println(d.hashCode());

Boy b1 = new Boy(25,"Praj");
System.out.println(b1.hashCode());

Boy b2=b1;
System.out.println(b2.hashCode() );

Boy b3= new Boy(26,"Praj");
System.out.println(b3 .hashCode());
	}
	
	
	static class Boy{
		String name;
		int age;
		public Boy(int age,String name) {
			super();
			this.name = name;
			this.age = age;
		}
		
		//generate hash based on name
//		@Override
//		public int hashCode() {
//			return name.hashCode();
//		}
		
		//generate hash based on more than 1 fields
		@Override
		public int hashCode() {
			return Objects.hash(name,age);
		}
		
	}

}
