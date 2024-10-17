# Vehicle Management System

## Overview

This is a simple Vehicle Management System built using Java. It defines a hierarchy of vehicle classes with common and specific attributes for different types of vehicles, such as cars and motorcycles. The system showcases basic inheritance, encapsulation, and polymorphism concepts in object-oriented programming (OOP).

## Project Structure

The project consists of three main classes:

1. **Vehicle**: The base class that contains general attributes such as `brand` and `model`, and a method `power()` which can be overridden by derived classes.
2. **Car**: A class that inherits from `Vehicle` and adds the specific attribute `numberPorts` (i.e., number of doors). The `power()` method is overridden to provide a car-specific behavior.
3. **Motorcycle**: A class that also inherits from `Vehicle` and includes an additional attribute `numberCylinders` (i.e., engine cylinder count). The `power()` method is overridden for motorcycle-specific behavior.

The `Main` class is the entry point of the application, where instances of `Car` and `Motorcycle` are created and their details are displayed.

## Features

- **Vehicle Class**:  
  Defines common vehicle attributes like `brand`, `model`, and a `power()` method that can be overridden by subclasses.

- **Car Class**:  
  Inherits from `Vehicle` and includes the number of doors (`numberPorts`). Has a custom `power()` method that outputs "Car is powered -- VRUUM".

- **Motorcycle Class**:  
  Inherits from `Vehicle` and adds the number of engine cylinders (`numberCylinders`). Has a custom `power()` method that outputs "Motorcycle is powered -- Rammmmmmm".

- **Polymorphism**:  
  The `power()` method is overridden in both `Car` and `Motorcycle` classes, showing polymorphism in action.

## How to Use

### Requirements
- JDK 8 or higher installed.

### Running the Project
1. Clone or download the repository to your local machine.
2. Compile and run the `Main` class.

###Example Output

```bash

_________ Vehicle Management System _________

_________ Car 1 Details _________
Brand: Fiat
Model: Uno
Ports: 5
Car is powered -- VRUUM

_________ Car 2 Details _________
Brand: Toyota
Model: Corolla
Ports: 5
Car is powered -- VRUUM

_________ Motorcycle 1 Details _________
Brand: Harley Davidson
Model: Sportster
Cylinders: 750
Motorcycle is powered -- Rammmmmmm

```
## Class Breakdown
### Vehicle Class

This class serves as the parent class, holding common attributes and methods for all vehicles. It includes getter and setter methods for brand and model.

```bash
package model;

public class Vehicle {

    protected String brand;
    protected String model;

    public void power() {
        System.out.println("Vehicle is powered.");
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }
}
```
### Car Class
This class inherits from Vehicle and introduces the numberPorts attribute. It overrides the power() method to simulate the car engine sound.
```bash

package model;

public class Car extends Vehicle {

    private int numberPorts;

    public int getnumberPorts() {
        return numberPorts;
    }

    public void setnumberPorts(int numberPorts) {
        this.numberPorts = numberPorts;
    }

    @Override
    public void power() {
        System.out.println("Car is powered -- VRUUM");
    }
}

```

### Motorcycle Class
This class also inherits from Vehicle and adds the numberCylinders attribute. It overrides the power() method with a motorcycle-specific behavior.

```bash
package model;

public class Motorcycle extends Vehicle {

    private int numberCylinders;

    public int getnumberCylinders() {
        return numberCylinders;
    }

    public void setnumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    @Override
    public void power() {
        System.out.println("Motorcycle is powered -- Rammmmmmm");
    }
}
```
### Main Class
This is the main entry point where the vehicle objects are instantiated and their details printed.
```bash
import model.Car;
import model.Motorcycle;

public class Main {
    public static void main(String[] args) {

        System.out.println("_________ Vehicle Management System _________");

        Car car1 = new Car();
        Car car2 = new Car();
        Motorcycle mc1 = new Motorcycle();

        car1.setbrand("Fiat");
        car1.setmodel("Uno");
        car1.setnumberPorts(5);

        car2.setbrand("Toyota");
        car2.setmodel("Corolla");
        car2.setnumberPorts(5);

        mc1.setnumberCylinders(750);
        mc1.setbrand("Harley Davidson");
        mc1.setmodel("Sportster");

        System.out.println();
        System.out.println("_________ Car 1 Details _________");
        System.out.println("Brand: " + car1.getbrand());
        System.out.println("Model: " + car1.getmodel());
        System.out.println("Ports: " + car1.getnumberPorts());
        car1.power();

        System.out.println();
        System.out.println("_________ Car 2 Details _________");
        System.out.println("Brand: " + car2.getbrand());
        System.out.println("Model: " + car2.getmodel());
        System.out.println("Ports: " + car2.getnumberPorts());
        car2.power();

        System.out.println();
        System.out.println("_________ Motorcycle 1 Details _________");
        System.out.println("Brand: " + mc1.getbrand());
        System.out.println("Model: " + mc1.getmodel());
        System.out.println("Cylinders: " + mc1.getnumberCylinders());
        mc1.power();
    }
}
```
## Future Improvements

- Add more vehicle types (e.g., Truck, Bus).
- Implement more attributes like fuel consumption, speed, etc.
- Use interfaces for better abstraction and scalability.
- Add exception handling for incorrect input values.
