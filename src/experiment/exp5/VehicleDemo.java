package experiment.exp5;
// Base Class: Vehicle
class Vehicle {
    String brand;
    String model;
    double price;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details (overridden in subclasses)
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}

// Subclass: Car (extends Vehicle)
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    // Constructor for Car (calls Vehicle constructor)
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}

// Subclass: ElectricCar (extends Car)
class ElectricCar extends Car {
    double batteryCapacity; // in kWh
    double chargingTime; // in hours

    // Constructor for ElectricCar (calls Car constructor)
    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Electric Car Details:");
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}

// Subclass: Motorcycle (extends Vehicle)
class Motorcycle extends Vehicle {
    int engineCapacity; // in cc
    String type; // e.g., "Sport", "Cruiser"

    // Constructor for Motorcycle (calls Vehicle constructor)
    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc, Type: " + type);
    }
}

// Main Class
public class VehicleDemo {
    public static void main(String[] args) {
        // Creating objects for different vehicle types
        Car myCar = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model 3", 45000, 5, "Electric", 75, 6);
        Motorcycle myBike = new Motorcycle("Harley-Davidson", "Street 750", 7500, 749, "Cruiser");

        // Demonstrating polymorphism: calling overridden displayDetails()
        myCar.displayDetails();
        System.out.println();

        myElectricCar.displayDetails();
        System.out.println();

        myBike.displayDetails();
    }
}

