package come.work.home.model;

import java.util.Scanner;

public class Military extends Air {
    private int missiles;
    private boolean ejectionSystem;

    public Military() {
    }

    public Military(String model, int capacity, int body, int speed,int power, int wingspan, int minimumRunwayLengthForTakeOff, int missiles, boolean ejectionSystem) {
        super(model, capacity, body, speed, power, wingspan, minimumRunwayLengthForTakeOff);
        this.missiles = missiles;
        this.ejectionSystem = ejectionSystem;
    }

    public void infoAirMilitary() {
        System.out.println("Air model : " + getModel() + " \n  capacity hp : " + getCapacity() + "\n  body kg : " + getBody() +
                "\n max speed km/h : " + getSpeed() +
                "\n wingspan m  :" + getWingspan() + "\n minimum runway m: " + getMinimumRunwayLengthForTakeOff() +
                "\n missiles :" + getMissiles() + " \n ejection system " + ejectionSystem);
    }

    public boolean controlEjection(){
            if( ejectionSystem == true){
                System.out.println("Ejection system ON");
                return true;
            }else {
                System.out.println("Ejection system OFF");
                return false;
            }
    }

    public void puchMissiles() {
        if (getMissiles() == 0) {
            System.out.println(" NO remained MISSILES !!!");
        }
        Scanner scanner = new Scanner(System.in);
        int missil;
        int m;
        m = getMissiles();
        System.out.println("Inter Missiles for start!!!");
        do {

            do {
                missil = scanner.nextInt();
                if (missil > m) {
                    System.out.println("Inter correct missil!");
                }
            } while (missil > m);
            System.out.println("Missil GO!!!");
            m = m - missil;
            System.out.println(" has " + m + " missiles left ");
        } while (m > 0);
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
