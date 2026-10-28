package org.example.Inheritance.PO1;

public class test {
    static void main() {


//        Vehicle vehicle = new ElectricCar("XUV","XUV-7OO",2024,4);
//        vehicle.info();

        Vehicle genericVehicle = new Vehicle("Generic", "ModelX", 2020);
         Car myCar = new Car("Toyota", "Camry", 2022, 4);
         ElectricCar myTesla = new ElectricCar("Tesla", "Model S", 2024,  100);

         myTesla.info();
         myTesla.startEngine();
    }
}
