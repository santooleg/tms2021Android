package come.work.home.model;

import java.util.Scanner;

public class Civil extends Air{
    private int numberPassengers;
    private boolean businessClass;

    public Civil(){
    }

    public Civil(String model, int capacity, int body, int speed, int power, int wingspan, int minimumRunwayLengthForTakeOff, int numberPassengers, boolean businessClass){
        super(model, capacity, body, speed, power, wingspan, minimumRunwayLengthForTakeOff);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public void infoAirCivil(){
        System.out.println("Air model : " + getModel()  + " \n  capacity hp : " + getCapacity() + "\n  body kg : " + getBody() +
                "\n max speed km/h : " + getSpeed() +
                "\n wingspan m  :" + getWingspan()+ "\n minimum runway m: " + getMinimumRunwayLengthForTakeOff() +
                "\n passengers :" + getNumberPassengers() + " \n business class " + businessClass);
    }

    public void lodingPassenger(){
        Scanner scanner = new Scanner(System.in);
        int passenger;
        System.out.println("How many passenger do you want to load?");
        passenger = scanner.nextInt();
        if (passenger > getNumberPassengers()) {
            System.out.println("\n" +
                    "You need a bigger Air!");
        } else {
            System.out.println("Happy road!");
        }
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
