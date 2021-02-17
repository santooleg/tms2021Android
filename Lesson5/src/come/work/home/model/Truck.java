package come.work.home.model;

import java.util.Scanner;

public class Truck extends LandTransport{
    private int loadCarrier;

    public Truck(String model, int capacity, int body, int speed, int wheels, int fuelConsumption, int loadCarrier) {
        super(model, capacity, body, speed, wheels, fuelConsumption);
        this.loadCarrier = loadCarrier;
    }
    public void infoAutoTruck(){
        System.out.println("Auto model : " + getModel()  + " \n  capacity hp : " + getCapacity() + "\n  body kg : " + getBody() +
                "\n max speed km/h : " + getSpeed() + "\n whells :" + getWheels()+ "\n fuel consumption, litres per 100 km: " + getFuelConsumption() +
                "\n load carrier kg: :" + getLoadCarrier());
    }
    public void lodingCarrier(){
        Scanner scanner = new Scanner(System.in);
        int carrier;

        System.out.println("How many kilograms do you want to load?");
        carrier = scanner.nextInt();

            if (carrier > getLoadCarrier()) {
                System.out.println("\n" +
                        "You need a bigger truck!");

            } else {
                System.out.println("Happy road!");

            }


    }


    public int getLoadCarrier() {
        return loadCarrier;
    }

    public void setLoadCarrier(int loadCarrier) {
        this.loadCarrier = loadCarrier;
    }
}
