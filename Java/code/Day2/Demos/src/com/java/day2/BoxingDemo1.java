package com.java.day2;

public class BoxingDemo1 {

	public static void main(String[] args) {
		int x=12;
		String str="Welcome";
		double y=12.5;
		// Boxing 
		Object ob1=x;
		Object ob2=str;
		Object ob3=y;
		
		// unboxing 
		int x1 = (Integer)ob1;
		String str2 = (String)ob2;
		double y1 = (Double)ob3;
		
		System.out.println(x1);
		System.out.println(str2);
		System.out.println(y1);
	}
}
