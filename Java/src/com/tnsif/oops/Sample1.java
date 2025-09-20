package com.tnsif.oops;

 class Sample1 {
	

	
		int a=10;
		boolean b=true;
		public void show() {
			System.out.println("This is a show method");
		}
		
	}

 public class ClassDemo {

		public static void main(String[] args) {
			Sample1 s=new Sample1();
			System.out.println(s.a);
			System.out.println(s.b);
			s.show();

		}

	}

