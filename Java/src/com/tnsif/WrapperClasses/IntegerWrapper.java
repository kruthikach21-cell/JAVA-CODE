package com.tnsif.WrapperClasses;

public class IntegerWrapper {
	public static void main(String[] args) {
        int i = 30;
        Integer intObj = i;
        int iVal = intObj;

        System.out.println("Integer object: " + intObj);
        System.out.println("Primitive int: " + iVal);
        System.out.println("Integer MAX_VALUE = " + Integer.MAX_VALUE);
    }
}
