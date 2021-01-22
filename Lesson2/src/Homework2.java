import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Homework2 {

    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(50, 49));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse());
    }

    /**
     * 1. Method should return sum of "a" and "b"
     * 2. (optional) if sum of a and b is more then int can store -- return -1;
     **/
    public static int sum(int a, int b) {
        int x = a + b;
        int z = Integer.MAX_VALUE + Integer.MAX_VALUE;
            if(x > z)
                 return x;
            else
                 return -1;
    }

    /**
     * Method should return larger of two numbers ("a" and "b")
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Method should return 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Method should return 10
     */
    public static int max(int a, int b) {
        int max;

        if (a < b)
            max = b;
        else
                max = a;
        return max;
    }

    /**
     * Method should return avg. value of given array (sum of all elements of array divided by array length).
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Method should return 3
     */
    public static double average(int[] array) {
        int sum = 0;
        for (int value : array){
            sum += value;
        }
        return (double) sum/array.length;
    }

    /**
     * (optional)
     * Method should return max element of array. For example if array = {1,2,10,3} then method should return 10;
     **/
    public static int max(int[] array) {
        int max = array[0];
        for (int j = 1; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
            }
        }
        return max;
    }

    /**
     * (optional)
     * 1. Read two ints from console
     * 2. Using the Pythagorean theorem calculate value of hypotenuse if value of two given ints -- value of triangle legs
     * Example1:
     * Console input:
     * 3
     * 4
     * Method should return 5
     * <p>
     * Example2:
     * Console input:
     * 12
     * 16
     * Method should return 20
     */
    public static double calculateHypotenuse() {
        System.out.println("Enter first side triagle:");
        Scanner alpha = new Scanner(System.in);

        double bravo = alpha.nextDouble();

        System.out.println("Enter second side of triagle:");
        double charlie = alpha.nextDouble();

        double delta =(Math.pow(bravo,2)) + (Math.pow(charlie,2));

        return sqrt(delta);
    }
}
