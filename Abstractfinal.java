abstract class Vehicle {

    abstract void start(String mode);
    abstract void accelerate(int speedIncrease);
    abstract void refuel(String fuelType, int amount);

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {

    void start(String mode) {
        System.out.println("Bike starts using " + mode);
    }

    void accelerate(int speedIncrease) {
        System.out.println("Bike accelerates by " + speedIncrease + " km/h");
    }

    void refuel(String fuelType, int amount) {
        System.out.println("Bike refueled with " + amount + " liters of " + fuelType);
    }
}

class Car extends Vehicle {

    void start(String mode) {
        System.out.println("Car starts using " + mode);
    }

    void accelerate(int speedIncrease) {
        System.out.println("Car accelerates by " + speedIncrease + " km/h");
    }

    void refuel(String fuelType, int amount) {
        System.out.println("Car refueled with " + amount + " liters of " + fuelType);
    }
}

public class Abstractfinal {
    public static void main(String[] args) {

        Vehicle myBike = new Bike();
        Vehicle myCar = new Car();

        myBike.start("self-start");
        myBike.accelerate(20);
        myBike.refuel("Petrol", 5);
        myBike.stop();

        System.out.println();

        myCar.start("key ignition");
        myCar.accelerate(40);
        myCar.refuel("Diesel", 20);
        myCar.stop();
    }
}
