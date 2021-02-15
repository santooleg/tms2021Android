import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println(operation(1));
        System.out.println(operation(0));
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Method should perform some operation with int "number" based on some conditions:
     * - if number is positive - increase it by 1
     * - if number is negative - decrease it by 2
     * - if number is equal to zero - replace it with 10
     * return number value after operation
     */
    public static int operation(int number) {
        if (number > 0) {
            number += 1;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * Method should print different strings in console based on some conditions:
     * - if remainder of the division number by 3 is zero - print "foo" (example of number - 6)
     * - if remainder of the division number by 5 is zero - print "bar" (example of number - 10)
     * - if remainder of the division number by both 3 and 5 is zero 0  and - print "foobar" (example of number - 15)
     */
    public static void foobar(int number) {


        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");

        }
        else if (number % 5 == 0) {
            System.out.println("bar");

        }
        else if (number % 3 == 0 ) {
            System.out.println("foo");


        }

    }

    /**
     * Steps to implement:
     * - Read two ints from console
     * - Create a two-dimensional int array (use ints that you read from console height and width)
     * - Fill array with random values (under 100)
     * - Print in console matrix with given size, but:
     * - If remainder of the division array element by 3 is zero - print "+" sign instead of array element value
     * - If remainder of the division array element by 7 is zero - print "-" sign instead of array element value
     * - Print "*" otherwise
     * <p>
     * Example:
     * - Values from console -  2 and 3
     * - Array will look like this (values be different because it's a random)
     * 6 11 123
     * 1 14 21
     * - For this values output in console should be:
     * <p>
     * + * *
     * * - +
     * <p>
     * Note that 21 % 3 == 0 and 21 % 7 = 0, but output is not +-, but +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        int higth = scanner.nextInt();
        int wigth = scanner.nextInt();
        String c1 = "+";
        String c2 = "-";
        String c3 = "*";

        int[][] matrix = new int[higth][wigth];
        Random random = new Random();

        for (int[]row : matrix) {
            for (int i = 0; i < row.length; i++) {

               row[i] = random.nextInt(100);
            }
        }
        String[][] matrix1 = new String[higth][wigth];



            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    matrix1[i][j] = Integer.toString(matrix[i][j]);
                    if (matrix[i][j] % 3 == 0) {
                        matrix1[i][j] = c1;
                    } else if (matrix[i][j] % 7 == 0) {
                        matrix1[i][j] = c2;
                    } else {
                        matrix1[i][j] = c3;
                    }
                }

            }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        for (String[] row1 : matrix1) {
            System.out.println(Arrays.toString(row1));
        }

    }


    /**
     * (optional)
     * Method should print all prime numbers < 1000
     */
    public static void printPrimeNumbers() {

        for (int i = 1; i < 1000; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(i + " ");
        }

        System.out.println("\b\b");
    }


}
