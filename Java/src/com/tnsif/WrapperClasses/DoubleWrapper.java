package com.tnsif.WrapperClasses;

public class DoubleWrapper {
	public static void main(String[] args) {
        double d = 99.99;
        Double doubleObj = d;
        double dVal = doubleObj;

        System.out.println("Double object: " + doubleObj);
        System.out.println("Primitive double: " + dVal);
        System.out.println("Double MIN_VALUE = " + Double.MIN_VALUE);
    }

}

