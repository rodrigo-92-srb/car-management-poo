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
