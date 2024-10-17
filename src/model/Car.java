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
