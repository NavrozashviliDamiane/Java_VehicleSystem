package org.TransportSystem;

// Abstract class representing a generic Watercraft
abstract class Watercraft extends Vehicle implements Swimmable {
    public Watercraft(String brand) {
        super(brand);
    }

    public abstract void setSail();
}
