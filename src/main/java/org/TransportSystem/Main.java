package org.TransportSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();
        car.displayBrand();

        Car myCar = new Car("Honda");
        myCar.start("MyKeyFob");

        Vehicle motorcycle = new Motorcycle("Harley-Davidson");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.displayBrand();

        Vehicle boat = new Watercraft("Bayliner") {
            @Override
            public void start() {
                System.out.println("Boat starting...");
            }

            @Override
            public void stop() {
                System.out.println("Boat stopping...");
            }

            @Override
            public void setSail() {
                System.out.println("Setting sail...");
            }

            @Override
            public void swim() {
                System.out.println("Boat swimming...");
            }
        };
        boat.start();
        boat.stop();
        boat.displayBrand();
        ((Watercraft) boat).setSail();
    }
}