package com.tnsif.WrapperClasses;

public class ByteWrapper {
	public static void main(String[] args) {
        byte b = 10;
        Byte byteObj = b; // Autoboxing
        byte bVal = byteObj; // Unboxing

        System.out.println("Byte object: " + byteObj);
        System.out.println("Primitive byte: " + bVal);
    }
}

