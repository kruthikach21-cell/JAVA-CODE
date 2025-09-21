package com.tnsif.WrapperClasses;

public class CharacterWrapper {
	 public static void main(String[] args) {
	        char c = 'A';
	        Character charObj = c;
	        char cVal = charObj;

	        System.out.println("Character object: " + charObj);
	        System.out.println("Primitive char: " + cVal);
	        System.out.println("Is 'A' a letter? " + Character.isLetter('A'));
	    }
	}

