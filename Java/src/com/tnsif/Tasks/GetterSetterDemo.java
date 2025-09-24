package com.tnsif.Tasks;

class Student{
	private String name;
	public void setName(String n) {
		name=n ;
	}
	public String getName() {
		return name;
	}
}
public class GetterSetterDemo {
	

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Kruthika");
		System.out.println("Student name:"+s.getName());
		

	}

}
