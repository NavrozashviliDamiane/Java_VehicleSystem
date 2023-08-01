package org.TransportSystem;

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping...");
    }

    // Method overloading to support starting the car with a key fob
    public void start(String keyFob) {
        System.out.println("Car starting with key fob: " + keyFob);
    }
}
