# Vehicle Management System

This is a simple Java project that demonstrates abstraction using abstract classes, interfaces, method overloading, and abstract methods to model a basic vehicle management system.



## Table of Contents

- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)
- [Vehicle Types](#vehicle-types)
- [Contributing](#contributing)
- [License](#license)

## Description

The Vehicle Management System is designed to showcase the concept of abstraction in Java through the use of abstract classes, interfaces, method overloading, and abstract methods. The project defines a set of classes and interfaces to model different types of vehicles such as cars, motorcycles, and watercraft.

## Installation

1. Clone the repository to your local machine using `git clone`.
2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ).
3. Build and run the project.

## Usage

The project provides a set of concrete classes representing different types of vehicles:

- `Car`: Represents a car and inherits from the abstract class `Vehicle`.
- `Motorcycle`: Represents a motorcycle and also inherits from the abstract class `Vehicle`.
- `Watercraft`: Represents a watercraft (e.g., boat) and inherits from the abstract class `Vehicle` and implements the `Swimmable` interface.

To use the classes, you can create instances of `Car`, `Motorcycle`, or `Watercraft`, and call the respective methods to start, stop, display brand, or perform any specific operation based on the type of vehicle.

## Vehicle Types

### Car

The `Car` class represents a car and inherits from the `Vehicle` abstract class. It has the following methods:

- `start()`: Starts the car.
- `stop()`: Stops the car.
- `displayBrand()`: Displays the brand of the car.
- `start(String keyFob)`: Method overloading to start the car using a key fob.

### Motorcycle

The `Motorcycle` class represents a motorcycle and inherits from the `Vehicle` abstract class. It has the following methods:

- `start()`: Starts the motorcycle.
- `stop()`: Stops the motorcycle.
- `displayBrand()`: Displays the brand of the motorcycle.

### Watercraft

The `Watercraft` class represents a watercraft (e.g., boat) and inherits from the `Vehicle` abstract class and implements the `Swimmable` interface. It has the following methods:

- `start()`: Starts the watercraft.
- `stop()`: Stops the watercraft.
- `displayBrand()`: Displays the brand of the watercraft.
- `setSail()`: Abstract method to set the watercraft's sail.

## Contributing

Contributions to the Vehicle Management System are welcome! If you have any suggestions, bug reports, or improvements, please feel free to submit a pull request or open an issue.

