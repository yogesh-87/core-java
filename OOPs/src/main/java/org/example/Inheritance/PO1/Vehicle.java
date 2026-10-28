package org.example.Inheritance.PO1;

public class Vehicle {

    private String Brand;
   private String model;
   private int year;

    public Vehicle(String brand, String model, int year) {
        Brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("Vehicle Engine Started...");
    }

    public void info(){
        System.out.println(this.Brand);
        System.out.println(this.model);
        System.out.println(this.year);
    }
}
