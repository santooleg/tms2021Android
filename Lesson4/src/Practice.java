import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            //      for(иницилизация, логическое выражение, обновление) {
            //  }
            // break - прерывание цикла

            System.out.println(i);

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }


        // с помощнью цикла for вывести все числа от 0 до 100 и которые делятся на пять
        for (int i = 0; i <= 10; i += 5) {
            System.out.println(i);
        }
        //        while (логиченское выражение) {
        //
        //    }

//        int i = 0;
//        while (i <= 10) {
//            System.out.println(i);
//            i += 5;
//
//            // do () {
//            // } while ()
//            //
//        }
//        int i = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Латте ( нажмите 1)");
//        System.out.println("Капучино ( нажмите 2)");
//        System.out.println("Выход ( нажмите 3)");
//         i = scanner.nextInt();
//        System.out.println("");
//        switch (i){
//            case 1 -> System.out.println("");
//            case 2 -> System.out.println("")
//        }
//
//        do {
//
//        } while (){
//
//        }
//        smth();
//        System.out.println("after smth");
//
//        if (true) {
//            System.out.println("123");
//            return;
//        }
//
//        for (int i = 0; i <=10; i++){
//            for (int j = 0; j <= 10; j ++){
//                System.out.println(i + j);
//                return;
//            }
//            System.out.println("this will never happen");
//        }
//        public static  void smth(){
//            System.out.println("start");
//            if(true){
//                return;;
//            }
//        }

        //      continue  работает только в циклах
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
//        break  работает с циклами и switch
        int[] array = {1, 2, 3, 4, 2};
        for (int element : array) {
            if (element > 3) {
                continue;
            }
            System.out.println(element);
        }
        for (int element : array) {
            if (element > 3) {
                break;
            }
            System.out.println(element);
        }

        // можно давать имена, кроме тех,
        // которые зарезирвированыб любому блоку кода и потом прерывать его
        // через break (практического применения не придумали)
        primary_loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 5) {
                    System.out.println("ALARM");
                    break primary_loop;

                }
                System.out.println(i + " " + j);
            }
            System.out.println("bone!");

        }


    }
}
