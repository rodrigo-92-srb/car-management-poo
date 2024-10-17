import model.Car;
import model.Motorcycle;

public class Main {
    public static void main(String[] args) {

        System.out.println("_________ Vehicle Management System _________");
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setbrand("Fiat");
        car1.setmodel("Uno");
        car1.setnumberPorts(5);

        car2.setbrand("Toyota");
        car2.setmodel("Corolla");
        car2.setnumberPorts(5);

        Motorcycle mc1 = new Motorcycle();
        mc1.setnumberCylinders(750);
        mc1.setbrand("Harley Davidson");
        mc1.setmodel("Sportster");

        System.out.println();
        System.out.println("_________ Car 1 Details _________");
        System.out.println("Brand: "+car1.getbrand());
        System.out.println("Model: "+car1.getmodel());
        System.out.println("Ports:"+car1.getnumberPorts());
        car1.power();
        System.out.println();
        System.out.println("_________ Car 2 Details _________");
        System.out.println("Brand: "+car2.getbrand());
        System.out.println("Model: "+car2.getmodel());
        System.out.println("Ports:"+car2.getnumberPorts());
        car2.power();
        System.out.println();
        System.out.println("_________ Motorcycle 1 Details _________");
        System.out.println("Brand: "+mc1.getbrand());
        System.out.println("Model: "+mc1.getmodel());
        System.out.println("Cylinders:"+mc1.getnumberCylinders());
        mc1.power();

    }
}