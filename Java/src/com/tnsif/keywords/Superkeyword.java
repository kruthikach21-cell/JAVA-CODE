package com.tnsif.keywords;



//Parent class
class Vehicle {
 String type = "General Vehicle";

 void displayType() {
     System.out.println("Vehicle Type: " + type);
 }
}

//Child class
class Car extends Vehicle {
 String type = "Car";

 void displayType() {
     System.out.println("Child Type: " + type);      
     System.out.println("Parent Type: " + super.type); 
 }

 void show() {
     super.displayType(); 
     displayType();      
 }
}

//Main class
public class Superkeyword {
 public static void main(String[] args) {
     Car c = new Car();
     c.show();
 }
}


