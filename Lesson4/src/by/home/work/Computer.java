package by.home.work;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String cpu;
    private int ram;
    private int hdd;
    private boolean work;

    public Computer() {

    }

    public Computer(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void info() {
        System.out.println("I have computer at home : " + cpu + " " + "RAM : " + ram + " " + " HDD : " + hdd);
    }

    public void push() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter 0 or 1 ");
        int a = scanner.nextInt();
        int b = random.nextInt(2);
        if (a == b) {
            System.out.println("Computer is on!");
        } else {
            System.out.println("Computer BENG!!!");
        }


    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}
