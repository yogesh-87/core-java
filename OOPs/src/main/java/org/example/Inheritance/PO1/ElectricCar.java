package org.example.Inheritance.PO1;

public class ElectricCar extends Vehicle{

    private int batteryCapacity;
    public ElectricCar(String brand, String model, int year,int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Start Electric Car engine...");
    }

    @Override
    public void info() {
        System.out.println("Electric Car Info..............");
        super.info();
        System.out.println(this.batteryCapacity);
        System.out.println("......");
    }
}
