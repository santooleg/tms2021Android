package come.work.home;

import come.work.home.model.*;

public class Main {
    public static void main(String[] args) {


        Transport audi = new Transport("Audi", 100, 1500, 222,1);








        Passenger audi2 = new Passenger("AUDI",100,1500,200, 1, 4,12,"SEDAN",6);
        audi2.infoAutoPassenger();
        audi2.distance();

        Truck maz = new Truck("MAZ",450,3500,110,1,6,27,3500);
        maz.infoAutoTruck();
        maz.lodingCarrier();




        Civil boing = new Civil("Boing", 1700, 15000,700,1,4,75,135,true);
        boing.infoAirCivil();

        Military mig = new Military("MIG", 2500, 4000,1000,1,6,25,15,false);
        mig.infoAirMilitary();
        mig.controlEjection();
        mig.puchMissiles();






    }
}
