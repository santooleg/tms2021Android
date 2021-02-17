package come.work.home.model;

import come.work.home.Transport;

import java.util.Scanner;

public class Air extends Transport {
    private int wingspan;
    private int minimumRunwayLengthForTakeOff;

    public Air(){

    }
    public Air(String model, int capacity, int body, int speed,int power, int wingspan, int minimumRunwayLengthForTakeOff) {
        super(model, capacity, body, speed, power);
        this.wingspan = wingspan; //m
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff; //m

    }


    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumRunwayLengthForTakeOff() {
        return minimumRunwayLengthForTakeOff;
    }

    public void setMinimumRunwayLengthForTakeOff(int minimumRunwayLengthForTakeOff) {
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }
}
