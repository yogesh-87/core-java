package org.example.Inheritance.PO1;

public class Car extends Vehicle{

    private int numDoors;

    public Car(String brand, String model, int year,int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Start Car engine with key...");
    }

    @Override
    public void info() {
        System.out.println("Car Vehicle Info...........");
        super.info();
        System.out.println(this.numDoors);
        System.out.println("......");
    }
}
