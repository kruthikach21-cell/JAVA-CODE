package com.tnsif.keywords;



final class FinalClassExample {
 // Final variable
 final int number = 100;

 // Final method
 final void show() {
     System.out.println("This is a final method.");
     System.out.println("Final number: " + number);
 }
}


public class Finalkeyword {
 public static void main(String[] args) {
     FinalClassExample obj = new FinalClassExample();
     obj.show();

    
 }
}



