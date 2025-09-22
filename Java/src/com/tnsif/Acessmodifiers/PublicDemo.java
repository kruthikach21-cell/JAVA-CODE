package com.tnsif.Acessmodifiers;
public class PublicDemo {
    public String name;
    public int age;

    // Public method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
       
        PublicDemo person = new PublicDemo();
        person.name = "ch kruthika";
        person.age = 20;
        person.displayInfo();
    }
}

