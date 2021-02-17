package come.work.home;

import come.work.home.model.*;

public class Main {
    public static void main(String[] args) {


        Transport audi = new Transport("Audi", 100, 1500, 222);



        LandTransport bmw = new LandTransport("BMW", 200, 2000, 200,22, 10);

        Passenger audi2 = new Passenger("AUDI", 150, 2000,260, 8,5,"Sedan", 5);
        audi2.infoAutoPassenger();
        audi2.distance();

        Truck maz = new Truck("MAZ",500, 5500,120,4,23,1500);
        maz.infoAutoTruck();
        maz.lodingCarrier();

        Civil boing = new Civil("Boing", 1700, 15000,700,8,75,135,true);
        boing.infoAirCivil();

        Military mig = new Military("MIG", 2500, 4000,1000,6,25,15,true);
        mig.infoAirMilitary();
        mig.puchMissiles();





    }
}
