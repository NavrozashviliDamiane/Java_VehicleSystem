package org.TransportSystem;

// Abstract class representing a generic Vehicle
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();

    public abstract void stop();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

