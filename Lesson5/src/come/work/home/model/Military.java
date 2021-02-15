package come.work.home.model;

import java.util.Scanner;

public class Military extends Air {
    private int missiles;
    private boolean ejectionSystem;

    public Military() {

    }

    public Military(String model, int capacity, int body, int speed, int wingspan, int minimumRunwayLengthForTakeOff, int missiles, boolean ejectionSystem) {

        super(model, capacity, body, speed, wingspan, minimumRunwayLengthForTakeOff);
        this.missiles = missiles;
        this.ejectionSystem = ejectionSystem;

    }

    public void infoAirMilitary() {
        System.out.println("Auto model : " + getModel() + " \n  capacity hp : " + getCapacity() + "\n  body kg : " + getBody() +
                "\n max speed km/h : " + getSpeed() +
                "\n wingspan m  :" + getWingspan() + "\n minimum runway m: " + getMinimumRunwayLengthForTakeOff() +
                "\n missiles :" + getMissiles() + " \n ejection system " + ejectionSystem);
    }

    public void puchMissiles() {
        Scanner scanner = new Scanner(System.in);
        int missil;
        int m = getMissiles();

        System.out.println("Inter Missiles for start!!!");
        missil = scanner.nextInt();

        for (m = getMissiles(); m >= missil; )
            if (m >= missil) {
                System.out.println("Missil GO!!!");
                m = m - missil;
                System.out.println(" has " + m + " missiles left " );

                missil = scanner.nextInt();

            }
        System.out.println(" NO remained MISSILES !!!");


    }

    public int getMissiles() {
        return missiles;
    }

    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }
}
