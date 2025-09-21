package com.tnsif.WrapperClasses;

public class BooleanWrapper {
	 public static void main(String[] args) {
	        boolean bool = true;
	        Boolean boolObj = bool;
	        boolean boolVal = boolObj;

	        System.out.println("Boolean object: " + boolObj);
	        System.out.println("Primitive boolean: " + boolVal);
	        System.out.println("Boolean.parseBoolean(\"true\") = " + Boolean.parseBoolean("true"));
	    }

}

