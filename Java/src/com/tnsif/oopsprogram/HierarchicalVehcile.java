package com.tnsif.oopsprogram;



class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding...");
    }
}

class Truck extends Vehicle {
    void load() {
        System.out.println("Truck is loading goods...");
    }
}

public class HierarchicalVehcile {

    public static void main(String[] args) {
       
        Car car = new Car();
        car.start();   
        car.drive();   

        System.out.println();

        
        Bike bike = new Bike();
        bike.start();
        bike.ride();

        System.out.println();

       
        Truck truck = new Truck();
        truck.start();
        truck.load();
    }
}
