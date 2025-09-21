package com.tnsif.WrapperClasses;

public class LongWrapper {
	public static void main(String[] args) {
        long l = 4000L;
        Long longObj = l;
        long lVal = longObj;

        System.out.println("Long object: " + longObj);
        System.out.println("Primitive long: " + lVal);
    }
}
