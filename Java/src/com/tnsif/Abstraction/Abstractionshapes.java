package com.tnsif.Abstraction;


abstract class Shape {       
	int area;
	public abstract void calcArea();  
	public void show() {            
		System.out.println("The area of the shape");	}
}

class Square extends Shape {
	int side;
	Square(int side){ 
		this.side = side;
	}
	public void calcArea() {
		super.area = side * side;
		System.out.println("Area of Square = " + area);	
	}
}

class Rectangle extends Shape {
	int length;
	int bredth;
	Rectangle(int length, int bredth){
		this.length = length;
		this.bredth = bredth;
	}
	public void calcArea() {
		super.area = length * bredth;
		System.out.println("Area of Rectangle = " + area);	
	}
}
public class Abstractionshapes {

	public static void main(String[] args) {
		
		Square sq = new Square(6);
		sq.calcArea();
		
		Rectangle re = new Rectangle(2,5);
		re.calcArea();
		
	}

}
