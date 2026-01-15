class Vehicle {
    String make;
    String model;
    int year;
}

class Car extends Vehicle {
    String color;
    int numDoors;
}

public class VehicleCar {
    public static void main(String[] args) {
        Car c = new Car();

        c.make = "Rolls-Royce";
        c.model = "Phantom";
        c.year = 2023;
    
        c.color = "Black";
        c.numDoors = 4;

        System.out.println("Make : " + c.make);
        System.out.println("Model : " + c.model);
        System.out.println("Year : " + c.year);
        System.out.println("Color : " + c.color);
        System.out.println("Num Doors : " + c.numDoors);
    }
}
