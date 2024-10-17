package model;

public class Motorcycle extends Vehicle{

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
