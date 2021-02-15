package by.home.work;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private final String CPU = "AMD Razen 4GHz 8 core";
    private final String SSD = "512GB0";
    private final String RAM = "16GB";
    private int countLifeCycle = 10;
    private ComputerCondition computerCondition;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    {
        computerCondition = ComputerCondition.STATE_OFF;
    }

  public void turnOn() {
      System.out.println("Input 0 or 1 : ");
      switch (computerCondition) {
          case STATE_ON:
              System.out.println("Computer is working");
              break;
          case STATE_OFF:
              if (countLifeCycle > 0 && random.nextInt(2) == scanner.nextInt()) {
                  computerCondition = ComputerCondition.STATE_ON;
                  System.out.println("Computer ON");
              } else {
                  System.out.println("Computer broken!");
                  computerCondition = ComputerCondition.STATE_BREAK;
              }
              break;
          case STATE_BREAK:
              System.out.println("Computer broken!");

      }

    }

    public void turnOff(){
        System.out.println("Input 0 or 1 :");
        switch (computerCondition) {
            case STATE_ON:
                if (countLifeCycle > 0 && random.nextInt(2) == scanner.nextInt()){
                    countLifeCycle--;
                    computerCondition = ComputerCondition.STATE_OFF;
                    System.out.println("Computer OFF");
                } else {
                    System.out.println("Computer broken!");
                    computerCondition = ComputerCondition.STATE_BREAK;

                }
                break;
        }
    }
    public String info() {
        System.out.println("My computer : " + CPU + SSD + RAM);
        return computerCondition.name();

    }




    public ComputerCondition getComputerStatus() {
        return computerCondition;
    }



}
