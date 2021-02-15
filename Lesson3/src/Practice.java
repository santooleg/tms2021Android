import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heigth = scanner.nextInt();
        int width = scanner.nextInt();
        int[][] array = new int[heigth][width];
        Random random = new Random();
        for (int[] row : array) {
            for (int i = 0; i < array.length; i++) {
                row[i] = random.nextInt(100);
            }

        }
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];


        }

        System.out.println(sum);

    }
    /**
     * На вход приходит число. Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на count которое пришло, и заменить окончание "программистов"
     * на уместное с точки русского языка (1 программист, 10 программистов) и тд
     *
     */
    /*
    public static void countDevs(int count) {
        int last = count % 10;


        if (last == 0){
            if ( count == 0 ){
                System.out.println(count + "программист");
            }
        }
    }
*/
    public static void condit(String[] args) {
        boolean condition = true && 100 > 99 ;
        boolean anotherCondition = true;
        if (condition){
            if (anotherCondition) {
                System.out.println("condition and another condition are equal to true");
            } else {
                System.out.println("condition is true but another condition false");
            }

        } else {
            System.out.println("condition false");
        }
        if (condition) {
            System.out.println("test1");
        }
            else {
                System.out.println("test2");
            }

    }
}

  /*      System.out.println(countOdd(new int[]{1, 2, 3, 4, 5}));


        /**
         * Метод должен вернуть кол-во нечетных элементов в массиве array
         * <p>
         * Example1:
         * array = {1,2,3,4,5}
         * Должен вернуть 3
         * Example1:
         * array = {0,2,3,4}
         * Должен вернуть 1
         *

        public static int countOdd(int[] array) {
            int sumElement = 0;
            for (int i = 0; i < array.length; i ++)
                if (element % 2 == 1 ) {
                    sumElement++;
                }

            return sumElement;
        }

*/
        /*
       Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

      int[] array = {1, 10, 4, 20};

      Arrays.sort(array);
        System.out.println(Arrays.toString(array));
  /*
        System.out.println(true || false); //true
        System.out.println(true && false); //false
        System.out.println(true ^ false); //true
        System.out.println(true && !false); //true
        System.out.println(1 & ~0); //1

        int a = 1;
        System.out.println(2 * ++a); //4
        System.out.println(2 * a ++); //4
        System.out.println(a);        //3

        boolean a = 100 >= 97 + 3.0001;
        System.out.println(a); //false
        boolean b = 100 >= 11 && 0b111 < 100;
        System.out.println(b); //true


        int[] array = new int[5];
        array[2] = 10;
        array[4] = 11;
        int length = array.length;
        int element = array[--length];
        System.out.println(element); //11
        System.out.println(array[--length]); //0

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();
        boolean d = scanner.hasNextBoolean();
        System.out.println(a + ", " + b + ", " + c + ", " + d);
     */


