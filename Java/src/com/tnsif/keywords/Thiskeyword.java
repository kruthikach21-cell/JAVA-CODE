package com.tnsif.keywords;


class Student {
    int id;
    String name;

    
    Student(int id, String name) {
        this.id = id;       
        this.name = name;   
    }

    void display() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }
}

public class Thiskeyword {
    public static void main(String[] args) {
        Student s1 = new Student(25, "Kruthika");
        s1.display();
    }
}


