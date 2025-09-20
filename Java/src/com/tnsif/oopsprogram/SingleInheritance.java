package com.tnsif.oopsprogram;


class A{
	 int a = 10;
	 public void show() {
			 System.out.println("this is base class");
   }
}
class B extends A {
	 int b = 20;
	 public void display() {
	 System.out.println("This is derived class");
	 
  }
}

public class SingleInheritance {
	    public static void main(String[] args) {
	        B obj = new B();    
	        obj.show();     
	        obj.display(); 
	    }
}



