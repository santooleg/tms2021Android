package come.work.home.model;

import come.work.home.Transport;

import java.util.Scanner;

public class LandTransport extends Transport {
    private int wheels; // колеса
    private int fuelConsumption; // litres per 100 km;

    public LandTransport(String model, int capacity, int body, int speed, int power, int wheels, int fuelConsumption ){
        super(model, capacity, body, speed, power);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }




    public void distance(){
        Scanner scanner = new Scanner(System.in);
        double time, litrs;

        int sp = getSpeed();
        int fuel = getFuelConsumption();

        System.out.println("Напишите время ");
        time = scanner.nextDouble();
        double dist = time * sp;
        litrs = dist / (double) fuel;

        System.out.printf("Za vremia " + time + " avto marki " + getModel() + " projedet km : %.2f i potratit topliva l : %.2f ", dist ,  litrs);


    }




    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
