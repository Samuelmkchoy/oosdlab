package jlab9q2;

public class CarTest{

    public static void main(String args[]){
        Car car1 = new Car();

        car1.setWheels(4);
        car1.setPassengers(4);
        car1.setType("saloon");
        car1.setPrice(4000);

        System.out.println("Car1: ");
        System.out.print("Wheels: " + car1.getWheels());
        System.out.print(", Passengers: " + car1.getPassengers());
        System.out.print(", Type: " + car1.getType());
        System.out.print(", Vehicle Price: " + car1.getPrice());
        System.out.println(", Import Duty Cost: " + car1.calculateDuty());

        Hgv hgv1 = new Hgv();

        hgv1.setWheels(6);
        hgv1.setPassengers(4);
        hgv1.setCargo(10);
        hgv1.setPrice(6000);

        System.out.println("Hgv1: ");
        System.out.print("Wheels: " + hgv1.getWheels());
        System.out.print(", Passengers: " + hgv1.getPassengers());
        System.out.print(", Cargo Size: " + hgv1.getCargo());
        System.out.print(", Vehicle Price: " + hgv1.getPrice());
        System.out.println(", Import Duty Cost: " + hgv1.calculateDuty());
    }
}