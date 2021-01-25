import java.io.Console;
import java.util.Scanner;

public class Practice {
    /*
    private  static int number = 12;

    //konstanta
    public static final  String IMAGE_PATH = "d:/dir/123/";

    public static void main(String[] args) throws InterruptedException{
        //objavlenie i inicilizazija peremennoj

        double numOneTwo = 1.1;

        byte a = 127;
        System.out.println(a);
        System.out.println(++a);
        String s = "asd";
        String ss = s;
        System.out.println(number);

       // massivy
       // int[] array = new  int[10];
        int[] array = {1,2,3,4,5,};
    }
    private void whatever(){
        System.out.println(number);

        byte a = 15;
        double c = 15.99;
        int b = (int) c;
        Integer i = Integer.MAX_VALUE;

        System.out.println(Math.round(i));

        int a =15;
        System.out.println(a++);
        System.out.println(++a);


        //mat operatory

        double b = 7. / 4;
        System.out.println(b);


        //prefeksnye ++a dobavliajet edenicu
        // post prefeksnyje, a++ nizkij prioritet

        int a = 1;
        int b = 1;
        b = ++b;
        System.out.println(b);
        System.out.println(11 % 5);

        // operatory
        int a = 2; //010
        int b = 5; //101
                   //111
        byte bb = 1;
                     //00000001 1
                     //00000000 0
                     //11111111 -1
                    //100000000    -128

        System.out.println(~bb);


        //operatory sravnenija
        // | - ili pobitovoje
        // || - ili dla boolean
        // && - i pobitovoje

        int a = 12;
        byte b = 12;
        System.out.println(a == b);
        String another = new String( "d:/dir/123/");
        System.out.println(another == IMAGE_PATH);
        another = IMAGE_PATH;
        System.out.println(another == IMAGE_PATH);
        System.out.println( a | b);
        boolean tmp = a > b && a < 100;

        if (a > b && a < 100 ){
            System.out.println("whatever");
        }

            //ternarnyj operator

        int a = number > 12 ? 1 : 0;


        System.out.println("tnt");
        Console console = System.console();
        String usersInput = console.readLine();
        System.out.println(usersInput);



        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);

     */

    //massivy
    public static void main(String[] args) {
        int[] array = {1, 5, 44, 55};
        int sum = 0;
        /*
        for (int element : array){
            sum += element;
        }
        */
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    private static void reassign(int b) {
        int a = 1;
        b = 24;
    }

}
