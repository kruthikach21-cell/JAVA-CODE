package com.tnsif.String;

public class Stringdemo {

	public static void main(String[] args) {
		String x="hello";
		String y="hello";
		System.out.println(x.equals(y));
		System.out.println(x==y);
		String s=new String("hello");
		System.out.println(x.equals(y));
		System.out.println(x==s);
		//operations
		x.charAt(2);
		System.out.println(x.toUpperCase());
		System.out.println(x);
	}
}
