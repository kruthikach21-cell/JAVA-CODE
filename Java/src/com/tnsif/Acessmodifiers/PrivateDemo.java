package com.tnsif.Acessmodifiers;
public class PrivateDemo {	    
	    private int data = 25;
	    private void show() {
	        System.out.println("Private Method called");
	        System.out.println("Data = " + data);
	    }	    
	    public void display() {	       
	        show();
	    }	 
	    public static void main(String[] args) {
	        PrivateDemo obj = new PrivateDemo();
	        obj.display();  
	    }
	}


